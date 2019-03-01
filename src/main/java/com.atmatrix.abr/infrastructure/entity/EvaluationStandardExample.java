package com.atmatrix.abr.infrastructure.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluationStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationStandardExample() {
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

        public Criteria andUnionCodeIsNull() {
            addCriterion("union_code is null");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIsNotNull() {
            addCriterion("union_code is not null");
            return (Criteria) this;
        }

        public Criteria andUnionCodeEqualTo(String value) {
            addCriterion("union_code =", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotEqualTo(String value) {
            addCriterion("union_code <>", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeGreaterThan(String value) {
            addCriterion("union_code >", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("union_code >=", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLessThan(String value) {
            addCriterion("union_code <", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLessThanOrEqualTo(String value) {
            addCriterion("union_code <=", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeLike(String value) {
            addCriterion("union_code like", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotLike(String value) {
            addCriterion("union_code not like", value, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeIn(List<String> values) {
            addCriterion("union_code in", values, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotIn(List<String> values) {
            addCriterion("union_code not in", values, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeBetween(String value1, String value2) {
            addCriterion("union_code between", value1, value2, "unionCode");
            return (Criteria) this;
        }

        public Criteria andUnionCodeNotBetween(String value1, String value2) {
            addCriterion("union_code not between", value1, value2, "unionCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeIsNull() {
            addCriterion("work_type_code is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeIsNotNull() {
            addCriterion("work_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeEqualTo(String value) {
            addCriterion("work_type_code =", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotEqualTo(String value) {
            addCriterion("work_type_code <>", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeGreaterThan(String value) {
            addCriterion("work_type_code >", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("work_type_code >=", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeLessThan(String value) {
            addCriterion("work_type_code <", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("work_type_code <=", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeLike(String value) {
            addCriterion("work_type_code like", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotLike(String value) {
            addCriterion("work_type_code not like", value, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeIn(List<String> values) {
            addCriterion("work_type_code in", values, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotIn(List<String> values) {
            addCriterion("work_type_code not in", values, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeBetween(String value1, String value2) {
            addCriterion("work_type_code between", value1, value2, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkTypeCodeNotBetween(String value1, String value2) {
            addCriterion("work_type_code not between", value1, value2, "workTypeCode");
            return (Criteria) this;
        }

        public Criteria andRobotAmountIsNull() {
            addCriterion("robot_amount is null");
            return (Criteria) this;
        }

        public Criteria andRobotAmountIsNotNull() {
            addCriterion("robot_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRobotAmountEqualTo(Integer value) {
            addCriterion("robot_amount =", value, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountNotEqualTo(Integer value) {
            addCriterion("robot_amount <>", value, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountGreaterThan(Integer value) {
            addCriterion("robot_amount >", value, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("robot_amount >=", value, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountLessThan(Integer value) {
            addCriterion("robot_amount <", value, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountLessThanOrEqualTo(Integer value) {
            addCriterion("robot_amount <=", value, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountIn(List<Integer> values) {
            addCriterion("robot_amount in", values, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountNotIn(List<Integer> values) {
            addCriterion("robot_amount not in", values, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountBetween(Integer value1, Integer value2) {
            addCriterion("robot_amount between", value1, value2, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andRobotAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("robot_amount not between", value1, value2, "robotAmount");
            return (Criteria) this;
        }

        public Criteria andAvgScoreIsNull() {
            addCriterion("avg_score is null");
            return (Criteria) this;
        }

        public Criteria andAvgScoreIsNotNull() {
            addCriterion("avg_score is not null");
            return (Criteria) this;
        }

        public Criteria andAvgScoreEqualTo(String value) {
            addCriterion("avg_score =", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreNotEqualTo(String value) {
            addCriterion("avg_score <>", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreGreaterThan(String value) {
            addCriterion("avg_score >", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreGreaterThanOrEqualTo(String value) {
            addCriterion("avg_score >=", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreLessThan(String value) {
            addCriterion("avg_score <", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreLessThanOrEqualTo(String value) {
            addCriterion("avg_score <=", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreLike(String value) {
            addCriterion("avg_score like", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreNotLike(String value) {
            addCriterion("avg_score not like", value, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreIn(List<String> values) {
            addCriterion("avg_score in", values, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreNotIn(List<String> values) {
            addCriterion("avg_score not in", values, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreBetween(String value1, String value2) {
            addCriterion("avg_score between", value1, value2, "avgScore");
            return (Criteria) this;
        }

        public Criteria andAvgScoreNotBetween(String value1, String value2) {
            addCriterion("avg_score not between", value1, value2, "avgScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNull() {
            addCriterion("max_score is null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNotNull() {
            addCriterion("max_score is not null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreEqualTo(String value) {
            addCriterion("max_score =", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotEqualTo(String value) {
            addCriterion("max_score <>", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThan(String value) {
            addCriterion("max_score >", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThanOrEqualTo(String value) {
            addCriterion("max_score >=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThan(String value) {
            addCriterion("max_score <", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThanOrEqualTo(String value) {
            addCriterion("max_score <=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLike(String value) {
            addCriterion("max_score like", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotLike(String value) {
            addCriterion("max_score not like", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIn(List<String> values) {
            addCriterion("max_score in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotIn(List<String> values) {
            addCriterion("max_score not in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreBetween(String value1, String value2) {
            addCriterion("max_score between", value1, value2, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotBetween(String value1, String value2) {
            addCriterion("max_score not between", value1, value2, "maxScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreIsNull() {
            addCriterion("exce_score is null");
            return (Criteria) this;
        }

        public Criteria andExceScoreIsNotNull() {
            addCriterion("exce_score is not null");
            return (Criteria) this;
        }

        public Criteria andExceScoreEqualTo(String value) {
            addCriterion("exce_score =", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreNotEqualTo(String value) {
            addCriterion("exce_score <>", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreGreaterThan(String value) {
            addCriterion("exce_score >", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreGreaterThanOrEqualTo(String value) {
            addCriterion("exce_score >=", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreLessThan(String value) {
            addCriterion("exce_score <", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreLessThanOrEqualTo(String value) {
            addCriterion("exce_score <=", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreLike(String value) {
            addCriterion("exce_score like", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreNotLike(String value) {
            addCriterion("exce_score not like", value, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreIn(List<String> values) {
            addCriterion("exce_score in", values, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreNotIn(List<String> values) {
            addCriterion("exce_score not in", values, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreBetween(String value1, String value2) {
            addCriterion("exce_score between", value1, value2, "exceScore");
            return (Criteria) this;
        }

        public Criteria andExceScoreNotBetween(String value1, String value2) {
            addCriterion("exce_score not between", value1, value2, "exceScore");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("delete is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("delete is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(Integer value) {
            addCriterion("delete =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(Integer value) {
            addCriterion("delete <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(Integer value) {
            addCriterion("delete >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(Integer value) {
            addCriterion("delete <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("delete <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<Integer> values) {
            addCriterion("delete in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<Integer> values) {
            addCriterion("delete not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(Integer value1, Integer value2) {
            addCriterion("delete between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("delete not between", value1, value2, "delete");
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