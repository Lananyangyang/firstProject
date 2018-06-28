package com.rhxt.ic.invoice.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rhxt.ic.generic.GenericDao;
import com.rhxt.ic.invoice.model.TInvoice;
import com.rhxt.ic.invoice.model.TInvoiceExample;

public interface TInvoiceMapper extends GenericDao<TInvoice, String>
{
	int countByExample(TInvoiceExample example);

	int deleteByExample(TInvoiceExample example);

	int insert(TInvoice record);

	List<TInvoice> selectByExample(TInvoiceExample example);

	int updateByExampleSelective(@Param("record") TInvoice record, @Param("example") TInvoiceExample example);

	int updateByExample(@Param("record") TInvoice record, @Param("example") TInvoiceExample example);

	int updateByPrimaryKey(TInvoice record);
	
	List<TInvoice> selectByOaId();
	
	List<String> selectDistinctOa(TInvoice invoice);
	
	List<TInvoice> selectTInvoice();
	
	List<TInvoice> selectByIdOrOaIdOrCode(TInvoice invoice);
}