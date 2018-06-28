package com.rhxt.ic.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @ClassName: TLoginUserExample
 * @Description: TODO
 * @author gaowang
 * @date 2018年6月13日 下午1:23:36
 *
 */
public class TLoginUserExample
{
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TLoginUserExample()
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

		public Criteria andLoginNameIsNull()
		{
			addCriterion("LOGIN_NAME is null");
			return (Criteria) this;
		}

		public Criteria andLoginNameIsNotNull()
		{
			addCriterion("LOGIN_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andLoginNameEqualTo(String value)
		{
			addCriterion("LOGIN_NAME =", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotEqualTo(String value)
		{
			addCriterion("LOGIN_NAME <>", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameGreaterThan(String value)
		{
			addCriterion("LOGIN_NAME >", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameGreaterThanOrEqualTo(String value)
		{
			addCriterion("LOGIN_NAME >=", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLessThan(String value)
		{
			addCriterion("LOGIN_NAME <", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLessThanOrEqualTo(String value)
		{
			addCriterion("LOGIN_NAME <=", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameLike(String value)
		{
			addCriterion("LOGIN_NAME like", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotLike(String value)
		{
			addCriterion("LOGIN_NAME not like", value, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameIn(List<String> values)
		{
			addCriterion("LOGIN_NAME in", values, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotIn(List<String> values)
		{
			addCriterion("LOGIN_NAME not in", values, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameBetween(String value1, String value2)
		{
			addCriterion("LOGIN_NAME between", value1, value2, "loginName");
			return (Criteria) this;
		}

		public Criteria andLoginNameNotBetween(String value1, String value2)
		{
			addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull()
		{
			addCriterion("PASSWORD is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull()
		{
			addCriterion("PASSWORD is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value)
		{
			addCriterion("PASSWORD =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value)
		{
			addCriterion("PASSWORD <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value)
		{
			addCriterion("PASSWORD >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value)
		{
			addCriterion("PASSWORD >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value)
		{
			addCriterion("PASSWORD <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value)
		{
			addCriterion("PASSWORD <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value)
		{
			addCriterion("PASSWORD like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value)
		{
			addCriterion("PASSWORD not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values)
		{
			addCriterion("PASSWORD in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values)
		{
			addCriterion("PASSWORD not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2)
		{
			addCriterion("PASSWORD between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2)
		{
			addCriterion("PASSWORD not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andNameIsNull()
		{
			addCriterion("NAME is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull()
		{
			addCriterion("NAME is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value)
		{
			addCriterion("NAME =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value)
		{
			addCriterion("NAME <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value)
		{
			addCriterion("NAME >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value)
		{
			addCriterion("NAME >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value)
		{
			addCriterion("NAME <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value)
		{
			addCriterion("NAME <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value)
		{
			addCriterion("NAME like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value)
		{
			addCriterion("NAME not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values)
		{
			addCriterion("NAME in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values)
		{
			addCriterion("NAME not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2)
		{
			addCriterion("NAME between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2)
		{
			addCriterion("NAME not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNull()
		{
			addCriterion("USER_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNotNull()
		{
			addCriterion("USER_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andUserTypeEqualTo(Short value)
		{
			addCriterion("USER_TYPE =", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotEqualTo(Short value)
		{
			addCriterion("USER_TYPE <>", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThan(Short value)
		{
			addCriterion("USER_TYPE >", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThanOrEqualTo(Short value)
		{
			addCriterion("USER_TYPE >=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThan(Short value)
		{
			addCriterion("USER_TYPE <", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThanOrEqualTo(Short value)
		{
			addCriterion("USER_TYPE <=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeIn(List<Short> values)
		{
			addCriterion("USER_TYPE in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotIn(List<Short> values)
		{
			addCriterion("USER_TYPE not in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeBetween(Short value1, Short value2)
		{
			addCriterion("USER_TYPE between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotBetween(Short value1, Short value2)
		{
			addCriterion("USER_TYPE not between", value1, value2, "userType");
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