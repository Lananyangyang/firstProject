/**
 * 
 */
package com.rhxt.ic.invoice.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.rhxt.ic.generic.GenericDao;
import com.rhxt.ic.generic.GenericServiceImpl;
import com.rhxt.ic.invoice.dao.TInvoiceMapper;
import com.rhxt.ic.invoice.model.Invoice;
import com.rhxt.ic.invoice.model.TInvoice;
import com.rhxt.ic.invoice.model.TInvoiceExample;
import com.rhxt.ic.invoice.model.TInvoiceExample.Criteria;
import com.rhxt.ic.invoice.service.ITInvoiceService;

/**
 *
 * @ClassName: TInvoiceServiceImpl
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 上午11:27:02
 *
 */
@Service
public class TInvoiceServiceImpl extends GenericServiceImpl<TInvoice, String> implements ITInvoiceService
{

	@Resource
	private TInvoiceMapper tInvoiceMapper;

	@Override
	public GenericDao<TInvoice, String> getDao()
	{
		return tInvoiceMapper;
	}

	@Override
	public List<TInvoice> selectByExample()
	{
		TInvoiceExample example = new TInvoiceExample();
		example.setOrderByClause(" OA_ID DESC ");
		List<TInvoice> list =tInvoiceMapper.selectTInvoice();
	
		return list;
	}

	@Override
	public List<TInvoice> selectByOaId(String oaId)
	{
		TInvoiceExample example = new TInvoiceExample();
		Criteria criteria = example.createCriteria();
		criteria.andOaIdEqualTo(oaId);
		List<TInvoice> list = tInvoiceMapper.selectByExample(example);
		return list;

	}

	@Override
	public List<TInvoice> checkByIdAndCode(String id, String code)
	{
		TInvoiceExample example = new TInvoiceExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		criteria.andCodeEqualTo("code");
		List<TInvoice> list = tInvoiceMapper.selectByExample(example);
		return list;

	}

	@Override
	public List<TInvoice> selectByIdOrOaIdOrCode(String id, String code, String oaId,String fillDate)
	{
		TInvoice invoice = new TInvoice();
		if (StringUtils.isNotEmpty(oaId)) {
			
			invoice.setOaId(oaId);
			
		}
		if (StringUtils.isNotEmpty(id)) {
			
			invoice.setId(id);
		}
		if (StringUtils.isNotEmpty(code)) {
			
			invoice.setCode(code);
		}
		Date date =new Date();
		if(StringUtils.isNotEmpty(fillDate)){
			SimpleDateFormat format = new SimpleDateFormat("yyyy");
			try {
				date = format.parse(fillDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		invoice.setFillDate(date);
		List<TInvoice> list = tInvoiceMapper.selectByIdOrOaIdOrCode(invoice);
		return list;
	}

	@Override
	public List<Invoice> countInvoiceByDesc(String fillDate)
	{
		TInvoice tInvoice = new TInvoice();
		Date date =new Date();
		if(StringUtils.isNotEmpty(fillDate)){
			SimpleDateFormat format = new SimpleDateFormat("yyyy");
			try {
				date = format.parse(fillDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		tInvoice.setFillDate(date);
		
		List<Invoice> list = new ArrayList<Invoice>();

		List<String> list2 = tInvoiceMapper.selectDistinctOa(tInvoice);
		for (String str : list2) {
			List<TInvoice> oa = selectByOaId(str);
			BigDecimal bigDecimal = new BigDecimal(0);
			Invoice invoice = new Invoice();
			for (int i = 0; i < oa.size(); i++) {
				if (i == 0) {

					invoice.setOaId(oa.get(i).getOaId());
				}
				BigDecimal amount = oa.get(i).getNoTaxAmount();
				bigDecimal = bigDecimal.add(amount);
			}

			invoice.setNoTaxAmount(bigDecimal);

			invoice.setCount(oa.size());
			list.add(invoice);

		}

		return list;
	}

	@Override
	public String saveInvoice(TInvoice tInvoice, HttpServletRequest request)
	{
		String ret = "";

		String id = tInvoice.getId();
		TInvoice invoice = tInvoiceMapper.selectByPrimaryKey(id);
		if (invoice != null) {

			ret = "{status:'warning', errorMsg:'该票据已使用,OA流水号#" + invoice.getOaId() + "#。'}";
			return ret;
		}

		tInvoice.setFillDate(new Date());
		int num = super.insert(tInvoice);

		if (num > 0) {
			ret = "{status:'success', errorMsg:'录入成功！'}";
		}
		else {
			ret = "{status:'fail', errorMsg:'录入失败，请重试！'}";
		}
		return ret;
	}

	@Override
	public Set<String> findOaIdArr()
	{
		TInvoiceExample example = new TInvoiceExample();
		List<TInvoice> list = tInvoiceMapper.selectByExample(example);
		Set<String> set = new HashSet<String>();

		for (TInvoice t : list) {
			set.add(t.getOaId());
		}
		return set;
	}

}
