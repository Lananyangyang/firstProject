package com.rhxt.ic.invoice.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 
 *
 * @ClassName: TInvoiceExample
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 下午1:23:06
 *
 */
public class TInvoiceExample
{
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TInvoiceExample()
	{
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause)
	{
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause()
	{
		return orderByClause;
	}

	public void setDistinct(boolean distinct)
	{
		this.distinct = distinct;
	}

	public boolean isDistinct()
	{
		return distinct;
	}

	public List<Criteria> getOredCriteria()
	{
		return oredCriteria;
	}

	public void or(Criteria criteria)
	{
		oredCriteria.add(criteria);
	}

	public Criteria or()
	{
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria()
	{
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal()
	{
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear()
	{
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria
	{
		protected List<Criterion> criteria;

		protected GeneratedCriteria()
		{
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid()
		{
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria()
		{
			return criteria;
		}

		public List<Criterion> getCriteria()
		{
			return criteria;
		}

		protected void addCriterion(String condition)
		{
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property)
		{
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property)
		{
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property)
		{
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property)
		{
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property)
		{
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull()
		{
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull()
		{
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value)
		{
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value)
		{
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value)
		{
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value)
		{
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value)
		{
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value)
		{
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value)
		{
			addCriterion("ID like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value)
		{
			addCriterion("ID not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values)
		{
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values)
		{
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2)
		{
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2)
		{
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull()
		{
			addCriterion("CODE is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull()
		{
			addCriterion("CODE is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value)
		{
			addCriterion("CODE =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value)
		{
			addCriterion("CODE <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value)
		{
			addCriterion("CODE >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value)
		{
			addCriterion("CODE >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value)
		{
			addCriterion("CODE <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value)
		{
			addCriterion("CODE <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value)
		{
			addCriterion("CODE like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value)
		{
			addCriterion("CODE not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values)
		{
			addCriterion("CODE in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values)
		{
			addCriterion("CODE not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2)
		{
			addCriterion("CODE between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2)
		{
			addCriterion("CODE not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andOaIdIsNull()
		{
			addCriterion("OA_ID is null");
			return (Criteria) this;
		}

		public Criteria andOaIdIsNotNull()
		{
			addCriterion("OA_ID is not null");
			return (Criteria) this;
		}

		public Criteria andOaIdEqualTo(String value)
		{
			addCriterion("OA_ID =", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdNotEqualTo(String value)
		{
			addCriterion("OA_ID <>", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdGreaterThan(String value)
		{
			addCriterion("OA_ID >", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdGreaterThanOrEqualTo(String value)
		{
			addCriterion("OA_ID >=", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdLessThan(String value)
		{
			addCriterion("OA_ID <", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdLessThanOrEqualTo(String value)
		{
			addCriterion("OA_ID <=", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdLike(String value)
		{
			addCriterion("OA_ID like", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdNotLike(String value)
		{
			addCriterion("OA_ID not like", value, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdIn(List<String> values)
		{
			addCriterion("OA_ID in", values, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdNotIn(List<String> values)
		{
			addCriterion("OA_ID not in", values, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdBetween(String value1, String value2)
		{
			addCriterion("OA_ID between", value1, value2, "oaId");
			return (Criteria) this;
		}

		public Criteria andOaIdNotBetween(String value1, String value2)
		{
			addCriterion("OA_ID not between", value1, value2, "oaId");
			return (Criteria) this;
		}

		public Criteria andInvDateIsNull()
		{
			addCriterion("INV_DATE is null");
			return (Criteria) this;
		}

		public Criteria andInvDateIsNotNull()
		{
			addCriterion("INV_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andInvDateEqualTo(Date value)
		{
			addCriterionForJDBCDate("INV_DATE =", value, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateNotEqualTo(Date value)
		{
			addCriterionForJDBCDate("INV_DATE <>", value, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateGreaterThan(Date value)
		{
			addCriterionForJDBCDate("INV_DATE >", value, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateGreaterThanOrEqualTo(Date value)
		{
			addCriterionForJDBCDate("INV_DATE >=", value, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateLessThan(Date value)
		{
			addCriterionForJDBCDate("INV_DATE <", value, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateLessThanOrEqualTo(Date value)
		{
			addCriterionForJDBCDate("INV_DATE <=", value, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateIn(List<Date> values)
		{
			addCriterionForJDBCDate("INV_DATE in", values, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateNotIn(List<Date> values)
		{
			addCriterionForJDBCDate("INV_DATE not in", values, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateBetween(Date value1, Date value2)
		{
			addCriterionForJDBCDate("INV_DATE between", value1, value2, "invDate");
			return (Criteria) this;
		}

		public Criteria andInvDateNotBetween(Date value1, Date value2)
		{
			addCriterionForJDBCDate("INV_DATE not between", value1, value2, "invDate");
			return (Criteria) this;
		}

		public Criteria andCheckCodeIsNull()
		{
			addCriterion("CHECK_CODE is null");
			return (Criteria) this;
		}

		public Criteria andCheckCodeIsNotNull()
		{
			addCriterion("CHECK_CODE is not null");
			return (Criteria) this;
		}

		public Criteria andCheckCodeEqualTo(String value)
		{
			addCriterion("CHECK_CODE =", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeNotEqualTo(String value)
		{
			addCriterion("CHECK_CODE <>", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeGreaterThan(String value)
		{
			addCriterion("CHECK_CODE >", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeGreaterThanOrEqualTo(String value)
		{
			addCriterion("CHECK_CODE >=", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeLessThan(String value)
		{
			addCriterion("CHECK_CODE <", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeLessThanOrEqualTo(String value)
		{
			addCriterion("CHECK_CODE <=", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeLike(String value)
		{
			addCriterion("CHECK_CODE like", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeNotLike(String value)
		{
			addCriterion("CHECK_CODE not like", value, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeIn(List<String> values)
		{
			addCriterion("CHECK_CODE in", values, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeNotIn(List<String> values)
		{
			addCriterion("CHECK_CODE not in", values, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeBetween(String value1, String value2)
		{
			addCriterion("CHECK_CODE between", value1, value2, "checkCode");
			return (Criteria) this;
		}

		public Criteria andCheckCodeNotBetween(String value1, String value2)
		{
			addCriterion("CHECK_CODE not between", value1, value2, "checkCode");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountIsNull()
		{
			addCriterion("NO_TAX_AMOUNT is null");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountIsNotNull()
		{
			addCriterion("NO_TAX_AMOUNT is not null");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountEqualTo(BigDecimal value)
		{
			addCriterion("NO_TAX_AMOUNT =", value, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountNotEqualTo(BigDecimal value)
		{
			addCriterion("NO_TAX_AMOUNT <>", value, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountGreaterThan(BigDecimal value)
		{
			addCriterion("NO_TAX_AMOUNT >", value, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountGreaterThanOrEqualTo(BigDecimal value)
		{
			addCriterion("NO_TAX_AMOUNT >=", value, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountLessThan(BigDecimal value)
		{
			addCriterion("NO_TAX_AMOUNT <", value, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountLessThanOrEqualTo(BigDecimal value)
		{
			addCriterion("NO_TAX_AMOUNT <=", value, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountIn(List<BigDecimal> values)
		{
			addCriterion("NO_TAX_AMOUNT in", values, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountNotIn(List<BigDecimal> values)
		{
			addCriterion("NO_TAX_AMOUNT not in", values, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountBetween(BigDecimal value1, BigDecimal value2)
		{
			addCriterion("NO_TAX_AMOUNT between", value1, value2, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andNoTaxAmountNotBetween(BigDecimal value1, BigDecimal value2)
		{
			addCriterion("NO_TAX_AMOUNT not between", value1, value2, "noTaxAmount");
			return (Criteria) this;
		}

		public Criteria andScanContentIsNull()
		{
			addCriterion("SCAN_CONTENT is null");
			return (Criteria) this;
		}

		public Criteria andScanContentIsNotNull()
		{
			addCriterion("SCAN_CONTENT is not null");
			return (Criteria) this;
		}

		public Criteria andScanContentEqualTo(String value)
		{
			addCriterion("SCAN_CONTENT =", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentNotEqualTo(String value)
		{
			addCriterion("SCAN_CONTENT <>", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentGreaterThan(String value)
		{
			addCriterion("SCAN_CONTENT >", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentGreaterThanOrEqualTo(String value)
		{
			addCriterion("SCAN_CONTENT >=", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentLessThan(String value)
		{
			addCriterion("SCAN_CONTENT <", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentLessThanOrEqualTo(String value)
		{
			addCriterion("SCAN_CONTENT <=", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentLike(String value)
		{
			addCriterion("SCAN_CONTENT like", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentNotLike(String value)
		{
			addCriterion("SCAN_CONTENT not like", value, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentIn(List<String> values)
		{
			addCriterion("SCAN_CONTENT in", values, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentNotIn(List<String> values)
		{
			addCriterion("SCAN_CONTENT not in", values, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentBetween(String value1, String value2)
		{
			addCriterion("SCAN_CONTENT between", value1, value2, "scanContent");
			return (Criteria) this;
		}

		public Criteria andScanContentNotBetween(String value1, String value2)
		{
			addCriterion("SCAN_CONTENT not between", value1, value2, "scanContent");
			return (Criteria) this;
		}

		public Criteria andFillUserNameIsNull()
		{
			addCriterion("FILL_USER_NAME is null");
			return (Criteria) this;
		}

		public Criteria andFillUserNameIsNotNull()
		{
			addCriterion("FILL_USER_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andFillUserNameEqualTo(String value)
		{
			addCriterion("FILL_USER_NAME =", value, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameNotEqualTo(String value)
		{
			addCriterion("FILL_USER_NAME <>", value, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameGreaterThan(String value)
		{
			addCriterion("FILL_USER_NAME >", value, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameGreaterThanOrEqualTo(String value)
		{
			addCriterion("FILL_USER_NAME >=", value, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameLessThan(String value)
		{
			addCriterion("FILL_USER_NAME <", value, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameLessThanOrEqualTo(String value)
		{
			addCriterion("FILL_USER_NAME <=", value, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameIn(List<String> values)
		{
			addCriterion("FILL_USER_NAME in", values, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameNotIn(List<String> values)
		{
			addCriterion("FILL_USER_NAME not in", values, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameBetween(String value1, String value2)
		{
			addCriterion("FILL_USER_NAME between", value1, value2, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserNameNotBetween(String value1, String value2)
		{
			addCriterion("FILL_USER_NAME not between", value1, value2, "fillUserName");
			return (Criteria) this;
		}

		public Criteria andFillUserIdIsNull()
		{
			addCriterion("FILL_USER_ID is null");
			return (Criteria) this;
		}

		public Criteria andFillUserIdIsNotNull()
		{
			addCriterion("FILL_USER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andFillUserIdEqualTo(String value)
		{
			addCriterion("FILL_USER_ID =", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdNotEqualTo(String value)
		{
			addCriterion("FILL_USER_ID <>", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdGreaterThan(String value)
		{
			addCriterion("FILL_USER_ID >", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdGreaterThanOrEqualTo(String value)
		{
			addCriterion("FILL_USER_ID >=", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdLessThan(String value)
		{
			addCriterion("FILL_USER_ID <", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdLessThanOrEqualTo(String value)
		{
			addCriterion("FILL_USER_ID <=", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdLike(String value)
		{
			addCriterion("FILL_USER_ID like", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdNotLike(String value)
		{
			addCriterion("FILL_USER_ID not like", value, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdIn(List<String> values)
		{
			addCriterion("FILL_USER_ID in", values, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdNotIn(List<String> values)
		{
			addCriterion("FILL_USER_ID not in", values, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdBetween(String value1, String value2)
		{
			addCriterion("FILL_USER_ID between", value1, value2, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillUserIdNotBetween(String value1, String value2)
		{
			addCriterion("FILL_USER_ID not between", value1, value2, "fillUserId");
			return (Criteria) this;
		}

		public Criteria andFillDateIsNull()
		{
			addCriterion("FILL_DATE is null");
			return (Criteria) this;
		}

		public Criteria andFillDateIsNotNull()
		{
			addCriterion("FILL_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andFillDateEqualTo(Date value)
		{
			addCriterionForJDBCDate("FILL_DATE =", value, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateNotEqualTo(Date value)
		{
			addCriterionForJDBCDate("FILL_DATE <>", value, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateGreaterThan(Date value)
		{
			addCriterionForJDBCDate("FILL_DATE >", value, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateGreaterThanOrEqualTo(Date value)
		{
			addCriterionForJDBCDate("FILL_DATE >=", value, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateLessThan(Date value)
		{
			addCriterionForJDBCDate("FILL_DATE <", value, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateLessThanOrEqualTo(Date value)
		{
			addCriterionForJDBCDate("FILL_DATE <=", value, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateIn(List<Date> values)
		{
			addCriterionForJDBCDate("FILL_DATE in", values, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateNotIn(List<Date> values)
		{
			addCriterionForJDBCDate("FILL_DATE not in", values, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateBetween(Date value1, Date value2)
		{
			addCriterionForJDBCDate("FILL_DATE between", value1, value2, "fillDate");
			return (Criteria) this;
		}

		public Criteria andFillDateNotBetween(Date value1, Date value2)
		{
			addCriterionForJDBCDate("FILL_DATE not between", value1, value2, "fillDate");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria
	{

		protected Criteria()
		{
			super();
		}
	}

	public static class Criterion
	{
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition()
		{
			return condition;
		}

		public Object getValue()
		{
			return value;
		}

		public Object getSecondValue()
		{
			return secondValue;
		}

		public boolean isNoValue()
		{
			return noValue;
		}

		public boolean isSingleValue()
		{
			return singleValue;
		}

		public boolean isBetweenValue()
		{
			return betweenValue;
		}

		public boolean isListValue()
		{
			return listValue;
		}

		public String getTypeHandler()
		{
			return typeHandler;
		}

		protected Criterion(String condition)
		{
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler)
		{
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			}
			else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value)
		{
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
		{
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue)
		{
			this(condition, value, secondValue, null);
		}
	}
}