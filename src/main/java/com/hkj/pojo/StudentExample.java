package com.hkj.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andS_idIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andS_idIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andS_idEqualTo(Integer value) {
            addCriterion("s_id =", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idGreaterThan(Integer value) {
            addCriterion("s_id >", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idLessThan(Integer value) {
            addCriterion("s_id <", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idIn(List<Integer> values) {
            addCriterion("s_id in", values, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_idNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "s_id");
            return (Criteria) this;
        }

        public Criteria andS_nameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andS_nameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andS_nameEqualTo(String value) {
            addCriterion("s_name =", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameGreaterThan(String value) {
            addCriterion("s_name >", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLessThan(String value) {
            addCriterion("s_name <", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameLike(String value) {
            addCriterion("s_name like", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotLike(String value) {
            addCriterion("s_name not like", value, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameIn(List<String> values) {
            addCriterion("s_name in", values, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_nameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "s_name");
            return (Criteria) this;
        }

        public Criteria andS_passwordIsNull() {
            addCriterion("s_password is null");
            return (Criteria) this;
        }

        public Criteria andS_passwordIsNotNull() {
            addCriterion("s_password is not null");
            return (Criteria) this;
        }

        public Criteria andS_passwordEqualTo(String value) {
            addCriterion("s_password =", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordNotEqualTo(String value) {
            addCriterion("s_password <>", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordGreaterThan(String value) {
            addCriterion("s_password >", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("s_password >=", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordLessThan(String value) {
            addCriterion("s_password <", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordLessThanOrEqualTo(String value) {
            addCriterion("s_password <=", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordLike(String value) {
            addCriterion("s_password like", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordNotLike(String value) {
            addCriterion("s_password not like", value, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordIn(List<String> values) {
            addCriterion("s_password in", values, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordNotIn(List<String> values) {
            addCriterion("s_password not in", values, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordBetween(String value1, String value2) {
            addCriterion("s_password between", value1, value2, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_passwordNotBetween(String value1, String value2) {
            addCriterion("s_password not between", value1, value2, "s_password");
            return (Criteria) this;
        }

        public Criteria andS_emailIsNull() {
            addCriterion("s_email is null");
            return (Criteria) this;
        }

        public Criteria andS_emailIsNotNull() {
            addCriterion("s_email is not null");
            return (Criteria) this;
        }

        public Criteria andS_emailEqualTo(String value) {
            addCriterion("s_email =", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailNotEqualTo(String value) {
            addCriterion("s_email <>", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailGreaterThan(String value) {
            addCriterion("s_email >", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailGreaterThanOrEqualTo(String value) {
            addCriterion("s_email >=", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailLessThan(String value) {
            addCriterion("s_email <", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailLessThanOrEqualTo(String value) {
            addCriterion("s_email <=", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailLike(String value) {
            addCriterion("s_email like", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailNotLike(String value) {
            addCriterion("s_email not like", value, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailIn(List<String> values) {
            addCriterion("s_email in", values, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailNotIn(List<String> values) {
            addCriterion("s_email not in", values, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailBetween(String value1, String value2) {
            addCriterion("s_email between", value1, value2, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_emailNotBetween(String value1, String value2) {
            addCriterion("s_email not between", value1, value2, "s_email");
            return (Criteria) this;
        }

        public Criteria andS_photoIsNull() {
            addCriterion("s_photo is null");
            return (Criteria) this;
        }

        public Criteria andS_photoIsNotNull() {
            addCriterion("s_photo is not null");
            return (Criteria) this;
        }

        public Criteria andS_photoEqualTo(String value) {
            addCriterion("s_photo =", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoNotEqualTo(String value) {
            addCriterion("s_photo <>", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoGreaterThan(String value) {
            addCriterion("s_photo >", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoGreaterThanOrEqualTo(String value) {
            addCriterion("s_photo >=", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoLessThan(String value) {
            addCriterion("s_photo <", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoLessThanOrEqualTo(String value) {
            addCriterion("s_photo <=", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoLike(String value) {
            addCriterion("s_photo like", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoNotLike(String value) {
            addCriterion("s_photo not like", value, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoIn(List<String> values) {
            addCriterion("s_photo in", values, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoNotIn(List<String> values) {
            addCriterion("s_photo not in", values, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoBetween(String value1, String value2) {
            addCriterion("s_photo between", value1, value2, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_photoNotBetween(String value1, String value2) {
            addCriterion("s_photo not between", value1, value2, "s_photo");
            return (Criteria) this;
        }

        public Criteria andS_autographIsNull() {
            addCriterion("s_autograph is null");
            return (Criteria) this;
        }

        public Criteria andS_autographIsNotNull() {
            addCriterion("s_autograph is not null");
            return (Criteria) this;
        }

        public Criteria andS_autographEqualTo(String value) {
            addCriterion("s_autograph =", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographNotEqualTo(String value) {
            addCriterion("s_autograph <>", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographGreaterThan(String value) {
            addCriterion("s_autograph >", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographGreaterThanOrEqualTo(String value) {
            addCriterion("s_autograph >=", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographLessThan(String value) {
            addCriterion("s_autograph <", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographLessThanOrEqualTo(String value) {
            addCriterion("s_autograph <=", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographLike(String value) {
            addCriterion("s_autograph like", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographNotLike(String value) {
            addCriterion("s_autograph not like", value, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographIn(List<String> values) {
            addCriterion("s_autograph in", values, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographNotIn(List<String> values) {
            addCriterion("s_autograph not in", values, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographBetween(String value1, String value2) {
            addCriterion("s_autograph between", value1, value2, "s_autograph");
            return (Criteria) this;
        }

        public Criteria andS_autographNotBetween(String value1, String value2) {
            addCriterion("s_autograph not between", value1, value2, "s_autograph");
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