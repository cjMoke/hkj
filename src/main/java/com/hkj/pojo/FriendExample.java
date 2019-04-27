package com.hkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class FriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFri_idIsNull() {
            addCriterion("fri_id is null");
            return (Criteria) this;
        }

        public Criteria andFri_idIsNotNull() {
            addCriterion("fri_id is not null");
            return (Criteria) this;
        }

        public Criteria andFri_idEqualTo(Integer value) {
            addCriterion("fri_id =", value, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idNotEqualTo(Integer value) {
            addCriterion("fri_id <>", value, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idGreaterThan(Integer value) {
            addCriterion("fri_id >", value, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("fri_id >=", value, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idLessThan(Integer value) {
            addCriterion("fri_id <", value, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idLessThanOrEqualTo(Integer value) {
            addCriterion("fri_id <=", value, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idIn(List<Integer> values) {
            addCriterion("fri_id in", values, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idNotIn(List<Integer> values) {
            addCriterion("fri_id not in", values, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idBetween(Integer value1, Integer value2) {
            addCriterion("fri_id between", value1, value2, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_idNotBetween(Integer value1, Integer value2) {
            addCriterion("fri_id not between", value1, value2, "fri_id");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1IsNull() {
            addCriterion("fri_s_id1 is null");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1IsNotNull() {
            addCriterion("fri_s_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1EqualTo(Integer value) {
            addCriterion("fri_s_id1 =", value, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1NotEqualTo(Integer value) {
            addCriterion("fri_s_id1 <>", value, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1GreaterThan(Integer value) {
            addCriterion("fri_s_id1 >", value, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1GreaterThanOrEqualTo(Integer value) {
            addCriterion("fri_s_id1 >=", value, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1LessThan(Integer value) {
            addCriterion("fri_s_id1 <", value, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1LessThanOrEqualTo(Integer value) {
            addCriterion("fri_s_id1 <=", value, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1In(List<Integer> values) {
            addCriterion("fri_s_id1 in", values, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1NotIn(List<Integer> values) {
            addCriterion("fri_s_id1 not in", values, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1Between(Integer value1, Integer value2) {
            addCriterion("fri_s_id1 between", value1, value2, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id1NotBetween(Integer value1, Integer value2) {
            addCriterion("fri_s_id1 not between", value1, value2, "fri_s_id1");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2IsNull() {
            addCriterion("fri_s_id2 is null");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2IsNotNull() {
            addCriterion("fri_s_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2EqualTo(Integer value) {
            addCriterion("fri_s_id2 =", value, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2NotEqualTo(Integer value) {
            addCriterion("fri_s_id2 <>", value, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2GreaterThan(Integer value) {
            addCriterion("fri_s_id2 >", value, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2GreaterThanOrEqualTo(Integer value) {
            addCriterion("fri_s_id2 >=", value, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2LessThan(Integer value) {
            addCriterion("fri_s_id2 <", value, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2LessThanOrEqualTo(Integer value) {
            addCriterion("fri_s_id2 <=", value, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2In(List<Integer> values) {
            addCriterion("fri_s_id2 in", values, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2NotIn(List<Integer> values) {
            addCriterion("fri_s_id2 not in", values, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2Between(Integer value1, Integer value2) {
            addCriterion("fri_s_id2 between", value1, value2, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_s_id2NotBetween(Integer value1, Integer value2) {
            addCriterion("fri_s_id2 not between", value1, value2, "fri_s_id2");
            return (Criteria) this;
        }

        public Criteria andFri_urlIsNull() {
            addCriterion("fri_url is null");
            return (Criteria) this;
        }

        public Criteria andFri_urlIsNotNull() {
            addCriterion("fri_url is not null");
            return (Criteria) this;
        }

        public Criteria andFri_urlEqualTo(String value) {
            addCriterion("fri_url =", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlNotEqualTo(String value) {
            addCriterion("fri_url <>", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlGreaterThan(String value) {
            addCriterion("fri_url >", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlGreaterThanOrEqualTo(String value) {
            addCriterion("fri_url >=", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlLessThan(String value) {
            addCriterion("fri_url <", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlLessThanOrEqualTo(String value) {
            addCriterion("fri_url <=", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlLike(String value) {
            addCriterion("fri_url like", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlNotLike(String value) {
            addCriterion("fri_url not like", value, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlIn(List<String> values) {
            addCriterion("fri_url in", values, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlNotIn(List<String> values) {
            addCriterion("fri_url not in", values, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlBetween(String value1, String value2) {
            addCriterion("fri_url between", value1, value2, "fri_url");
            return (Criteria) this;
        }

        public Criteria andFri_urlNotBetween(String value1, String value2) {
            addCriterion("fri_url not between", value1, value2, "fri_url");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}