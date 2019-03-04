package com.atmatrix.abr.infrastructure.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RobotOverdraftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RobotOverdraftExample() {
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

        public Criteria andRentUnionCodeIsNull() {
            addCriterion("rent_union_code is null");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeIsNotNull() {
            addCriterion("rent_union_code is not null");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeEqualTo(String value) {
            addCriterion("rent_union_code =", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeNotEqualTo(String value) {
            addCriterion("rent_union_code <>", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeGreaterThan(String value) {
            addCriterion("rent_union_code >", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_union_code >=", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeLessThan(String value) {
            addCriterion("rent_union_code <", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeLessThanOrEqualTo(String value) {
            addCriterion("rent_union_code <=", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeLike(String value) {
            addCriterion("rent_union_code like", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeNotLike(String value) {
            addCriterion("rent_union_code not like", value, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeIn(List<String> values) {
            addCriterion("rent_union_code in", values, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeNotIn(List<String> values) {
            addCriterion("rent_union_code not in", values, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeBetween(String value1, String value2) {
            addCriterion("rent_union_code between", value1, value2, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andRentUnionCodeNotBetween(String value1, String value2) {
            addCriterion("rent_union_code not between", value1, value2, "rentUnionCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeIsNull() {
            addCriterion("billing_type_code is null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeIsNotNull() {
            addCriterion("billing_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeEqualTo(String value) {
            addCriterion("billing_type_code =", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeNotEqualTo(String value) {
            addCriterion("billing_type_code <>", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeGreaterThan(String value) {
            addCriterion("billing_type_code >", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("billing_type_code >=", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeLessThan(String value) {
            addCriterion("billing_type_code <", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("billing_type_code <=", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeLike(String value) {
            addCriterion("billing_type_code like", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeNotLike(String value) {
            addCriterion("billing_type_code not like", value, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeIn(List<String> values) {
            addCriterion("billing_type_code in", values, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeNotIn(List<String> values) {
            addCriterion("billing_type_code not in", values, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeBetween(String value1, String value2) {
            addCriterion("billing_type_code between", value1, value2, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingTypeCodeNotBetween(String value1, String value2) {
            addCriterion("billing_type_code not between", value1, value2, "billingTypeCode");
            return (Criteria) this;
        }

        public Criteria andBillingLeftIsNull() {
            addCriterion("billing_left is null");
            return (Criteria) this;
        }

        public Criteria andBillingLeftIsNotNull() {
            addCriterion("billing_left is not null");
            return (Criteria) this;
        }

        public Criteria andBillingLeftEqualTo(Integer value) {
            addCriterion("billing_left =", value, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftNotEqualTo(Integer value) {
            addCriterion("billing_left <>", value, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftGreaterThan(Integer value) {
            addCriterion("billing_left >", value, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_left >=", value, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftLessThan(Integer value) {
            addCriterion("billing_left <", value, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftLessThanOrEqualTo(Integer value) {
            addCriterion("billing_left <=", value, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftIn(List<Integer> values) {
            addCriterion("billing_left in", values, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftNotIn(List<Integer> values) {
            addCriterion("billing_left not in", values, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftBetween(Integer value1, Integer value2) {
            addCriterion("billing_left between", value1, value2, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andBillingLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_left not between", value1, value2, "billingLeft");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftIsNull() {
            addCriterion("reference_overdraft is null");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftIsNotNull() {
            addCriterion("reference_overdraft is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftEqualTo(Integer value) {
            addCriterion("reference_overdraft =", value, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftNotEqualTo(Integer value) {
            addCriterion("reference_overdraft <>", value, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftGreaterThan(Integer value) {
            addCriterion("reference_overdraft >", value, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftGreaterThanOrEqualTo(Integer value) {
            addCriterion("reference_overdraft >=", value, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftLessThan(Integer value) {
            addCriterion("reference_overdraft <", value, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftLessThanOrEqualTo(Integer value) {
            addCriterion("reference_overdraft <=", value, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftIn(List<Integer> values) {
            addCriterion("reference_overdraft in", values, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftNotIn(List<Integer> values) {
            addCriterion("reference_overdraft not in", values, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftBetween(Integer value1, Integer value2) {
            addCriterion("reference_overdraft between", value1, value2, "referenceOverdraft");
            return (Criteria) this;
        }

        public Criteria andReferenceOverdraftNotBetween(Integer value1, Integer value2) {
            addCriterion("reference_overdraft not between", value1, value2, "referenceOverdraft");
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