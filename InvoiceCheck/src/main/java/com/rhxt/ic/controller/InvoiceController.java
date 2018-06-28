package com.rhxt.ic.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rhxt.ic.generic.GenericController;
import com.rhxt.ic.invoice.model.Invoice;
import com.rhxt.ic.invoice.model.TInvoice;
import com.rhxt.ic.invoice.service.ITInvoiceService;

import net.sf.json.JSONObject;

/**
 *
 * @ClassName: InvoiceController
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 上午11:36:00
 *
 */
@Controller
@RequestMapping(value = "/invoice")
public class InvoiceController extends GenericController
{

	@Resource
	private ITInvoiceService tInvoiceService;

	/**
	 * 查询oaid
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "/findOaIds", method = RequestMethod.POST)
	@ResponseBody
	public Set<String> findOaIds() throws IOException
	{
		Set<String> oaIds = tInvoiceService.findOaIdArr();
		return oaIds;
	}

	/**
	 * 保存发票信息
	 * 
	 * @param ids
	 * @throws IOException
	 */
	@RequestMapping(value = "/saveInvoice", method = RequestMethod.POST)
	public void saveInvoice(TInvoice tInvoice) throws IOException
	{
		String ret = tInvoiceService.saveInvoice(tInvoice, request);
		response.getWriter().write(JSONObject.fromObject(ret).toString());
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ModelAndView insert(TInvoice tInvoice, ModelAndView model)
	{

		String id = tInvoice.getId();
		TInvoice invoice = tInvoiceService.selectById(id);
		model.setViewName("");
		;
		if (invoice != null) {

			model.addObject("message", "票据重复");
			return model;
		}

		int i = tInvoiceService.insert(tInvoice);
		if (i > 0) {
			model.addObject("message", "录入成功");
		}
		return model;

	}

	// 查询发票所有信息

	@RequestMapping(value = "/query", method = RequestMethod.POST)
	@ResponseBody
	public List<TInvoice> query()
	{
		List<TInvoice> list = tInvoiceService.selectByExample();
		return list;
	}

	// 检查发票是否重复
	@RequestMapping(value = "/checkByIdAndCode", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView checkByIdAndCode(String id, String code, ModelAndView model)
	{
		List<TInvoice> list = tInvoiceService.checkByIdAndCode(id, code);
		if (list.size() > 0) {
			model.addObject("message", list);
		}
		return model;
	}

	// 条件查询 根据oa 代码 或者 号码
	@RequestMapping(value = "/selectByIdOrOaIdOrCode", method = RequestMethod.POST)
	@ResponseBody
	public List<TInvoice> selectByIdOrOaIdOrCode(String id, String code, String oaId,String fillDate)
	{
		List<TInvoice> list = tInvoiceService.selectByIdOrOaIdOrCode(id, code, oaId,fillDate);
		return list;
	}

	@RequestMapping(value = "/queryById", method = RequestMethod.POST)
	@ResponseBody
	public TInvoice queryById(TInvoice invoice)
	{
		String code = invoice.getCheckCode();
		TInvoice tInvoice = tInvoiceService.selectById(code);
		return tInvoice;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public TInvoice delete(TInvoice invoice)
	{
		String code = invoice.getCheckCode();
		TInvoice tInvoice = tInvoiceService.selectById(code);
		return tInvoice;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateInvoice(TInvoice invoice, ModelAndView model)
	{
		int i = tInvoiceService.update(invoice);
		model.setViewName("");
		if (i > 0) {

			model.addObject("message", "修改成功");

		}
		else {

			model.addObject("message", "修改失败");

		}
		return model;

	}

	// 发票信息统计
	@RequestMapping(value = "/countInvoiceByDesc")
	@ResponseBody
	public List<Invoice> countInvoiceByDesc(String fillDate)
	{
		List<Invoice> invoice = tInvoiceService.countInvoiceByDesc(fillDate);
		return invoice;
	}

}
