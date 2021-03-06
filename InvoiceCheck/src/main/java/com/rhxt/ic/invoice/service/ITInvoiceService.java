/**
 * 
 */
package com.rhxt.ic.invoice.service;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.rhxt.ic.generic.GenericService;
import com.rhxt.ic.invoice.model.Invoice;
import com.rhxt.ic.invoice.model.TInvoice;

/**
 *
 * @ClassName: IInvoiceService
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 上午11:24:48
 *
 */
public interface ITInvoiceService extends GenericService<TInvoice, String>
{
	List<TInvoice> selectByOaId(String oaId);

	List<TInvoice> checkByIdAndCode(String id, String code);

	List<TInvoice> selectByExample();

	List<TInvoice> selectByIdOrOaIdOrCode(String oaId, String id, String code, String fillDate);

	List<Invoice> countInvoiceByDesc(String fillDate);

	/**
	 * @param tInvoice
	 * @param request
	 * @return
	 */
	String saveInvoice(TInvoice tInvoice, HttpServletRequest request);

	/**
	 * 查询oaids
	 * 
	 * @return
	 */
	Set<String> findOaIdArr();

}
