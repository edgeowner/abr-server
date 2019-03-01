package com.atmatrix.abr.infrastructure.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExceRobotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExceRobotExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeIsNull() {
            addCriterion("robot_union_code is null");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeIsNotNull() {
            addCriterion("robot_union_code is not null");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeEqualTo(String value) {
            addCriterion("robot_union_code =", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeNotEqualTo(String value) {
            addCriterion("robot_union_code <>", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeGreaterThan(String value) {
            addCriterion("robot_union_code >", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("robot_union_code >=", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeLessThan(String value) {
            addCriterion("robot_union_code <", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeLessThanOrEqualTo(String value) {
            addCriterion("robot_union_code <=", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeLike(String value) {
            addCriterion("robot_union_code like", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeNotLike(String value) {
            addCriterion("robot_union_code not like", value, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeIn(List<String> values) {
            addCriterion("robot_union_code in", values, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeNotIn(List<String> values) {
            addCriterion("robot_union_code not in", values, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeBetween(String value1, String value2) {
            addCriterion("robot_union_code between", value1, value2, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andRobotUnionCodeNotBetween(String value1, String value2) {
            addCriterion("robot_union_code not between", value1, value2, "robotUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeIsNull() {
            addCriterion("exception_union_code is null");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeIsNotNull() {
            addCriterion("exception_union_code is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeEqualTo(String value) {
            addCriterion("exception_union_code =", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeNotEqualTo(String value) {
            addCriterion("exception_union_code <>", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeGreaterThan(String value) {
            addCriterion("exception_union_code >", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("exception_union_code >=", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeLessThan(String value) {
            addCriterion("exception_union_code <", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeLessThanOrEqualTo(String value) {
            addCriterion("exception_union_code <=", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeLike(String value) {
            addCriterion("exception_union_code like", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeNotLike(String value) {
            addCriterion("exception_union_code not like", value, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeIn(List<String> values) {
            addCriterion("exception_union_code in", values, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeNotIn(List<String> values) {
            addCriterion("exception_union_code not in", values, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeBetween(String value1, String value2) {
            addCriterion("exception_union_code between", value1, value2, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionUnionCodeNotBetween(String value1, String value2) {
            addCriterion("exception_union_code not between", value1, value2, "exceptionUnionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameIsNull() {
            addCriterion("exception_type_name is null");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameIsNotNull() {
            addCriterion("exception_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameEqualTo(String value) {
            addCriterion("exception_type_name =", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameNotEqualTo(String value) {
            addCriterion("exception_type_name <>", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameGreaterThan(String value) {
            addCriterion("exception_type_name >", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("exception_type_name >=", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameLessThan(String value) {
            addCriterion("exception_type_name <", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameLessThanOrEqualTo(String value) {
            addCriterion("exception_type_name <=", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameLike(String value) {
            addCriterion("exception_type_name like", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameNotLike(String value) {
            addCriterion("exception_type_name not like", value, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameIn(List<String> values) {
            addCriterion("exception_type_name in", values, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameNotIn(List<String> values) {
            addCriterion("exception_type_name not in", values, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameBetween(String value1, String value2) {
            addCriterion("exception_type_name between", value1, value2, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNameNotBetween(String value1, String value2) {
            addCriterion("exception_type_name not between", value1, value2, "exceptionTypeName");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("analysis is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("analysis is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("analysis =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("analysis <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("analysis >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("analysis >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("analysis <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("analysis <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("analysis like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("analysis not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("analysis in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("analysis not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("analysis between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("analysis not between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeIsNull() {
            addCriterion("exception_time is null");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeIsNotNull() {
            addCriterion("exception_time is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeEqualTo(Date value) {
            addCriterion("exception_time =", value, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeNotEqualTo(Date value) {
            addCriterion("exception_time <>", value, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeGreaterThan(Date value) {
            addCriterion("exception_time >", value, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exception_time >=", value, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeLessThan(Date value) {
            addCriterion("exception_time <", value, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeLessThanOrEqualTo(Date value) {
            addCriterion("exception_time <=", value, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeIn(List<Date> values) {
            addCriterion("exception_time in", values, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeNotIn(List<Date> values) {
            addCriterion("exception_time not in", values, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeBetween(Date value1, Date value2) {
            addCriterion("exception_time between", value1, value2, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andExceptionTimeNotBetween(Date value1, Date value2) {
            addCriterion("exception_time not between", value1, value2, "exceptionTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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