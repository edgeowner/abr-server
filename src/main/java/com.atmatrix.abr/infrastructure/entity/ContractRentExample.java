package com.atmatrix.abr.infrastructure.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractRentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractRentExample() {
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

        public Criteria andRentAddressIsNull() {
            addCriterion("rent_address is null");
            return (Criteria) this;
        }

        public Criteria andRentAddressIsNotNull() {
            addCriterion("rent_address is not null");
            return (Criteria) this;
        }

        public Criteria andRentAddressEqualTo(String value) {
            addCriterion("rent_address =", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressNotEqualTo(String value) {
            addCriterion("rent_address <>", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressGreaterThan(String value) {
            addCriterion("rent_address >", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("rent_address >=", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressLessThan(String value) {
            addCriterion("rent_address <", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressLessThanOrEqualTo(String value) {
            addCriterion("rent_address <=", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressLike(String value) {
            addCriterion("rent_address like", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressNotLike(String value) {
            addCriterion("rent_address not like", value, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressIn(List<String> values) {
            addCriterion("rent_address in", values, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressNotIn(List<String> values) {
            addCriterion("rent_address not in", values, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressBetween(String value1, String value2) {
            addCriterion("rent_address between", value1, value2, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRentAddressNotBetween(String value1, String value2) {
            addCriterion("rent_address not between", value1, value2, "rentAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressIsNull() {
            addCriterion("robot_address is null");
            return (Criteria) this;
        }

        public Criteria andRobotAddressIsNotNull() {
            addCriterion("robot_address is not null");
            return (Criteria) this;
        }

        public Criteria andRobotAddressEqualTo(String value) {
            addCriterion("robot_address =", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressNotEqualTo(String value) {
            addCriterion("robot_address <>", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressGreaterThan(String value) {
            addCriterion("robot_address >", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressGreaterThanOrEqualTo(String value) {
            addCriterion("robot_address >=", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressLessThan(String value) {
            addCriterion("robot_address <", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressLessThanOrEqualTo(String value) {
            addCriterion("robot_address <=", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressLike(String value) {
            addCriterion("robot_address like", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressNotLike(String value) {
            addCriterion("robot_address not like", value, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressIn(List<String> values) {
            addCriterion("robot_address in", values, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressNotIn(List<String> values) {
            addCriterion("robot_address not in", values, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressBetween(String value1, String value2) {
            addCriterion("robot_address between", value1, value2, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andRobotAddressNotBetween(String value1, String value2) {
            addCriterion("robot_address not between", value1, value2, "robotAddress");
            return (Criteria) this;
        }

        public Criteria andBillingPriceIsNull() {
            addCriterion("billing_price is null");
            return (Criteria) this;
        }

        public Criteria andBillingPriceIsNotNull() {
            addCriterion("billing_price is not null");
            return (Criteria) this;
        }

        public Criteria andBillingPriceEqualTo(Integer value) {
            addCriterion("billing_price =", value, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceNotEqualTo(Integer value) {
            addCriterion("billing_price <>", value, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceGreaterThan(Integer value) {
            addCriterion("billing_price >", value, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_price >=", value, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceLessThan(Integer value) {
            addCriterion("billing_price <", value, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("billing_price <=", value, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceIn(List<Integer> values) {
            addCriterion("billing_price in", values, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceNotIn(List<Integer> values) {
            addCriterion("billing_price not in", values, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceBetween(Integer value1, Integer value2) {
            addCriterion("billing_price between", value1, value2, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_price not between", value1, value2, "billingPrice");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIsNull() {
            addCriterion("billing_type is null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIsNotNull() {
            addCriterion("billing_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillingTypeEqualTo(String value) {
            addCriterion("billing_type =", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotEqualTo(String value) {
            addCriterion("billing_type <>", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeGreaterThan(String value) {
            addCriterion("billing_type >", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("billing_type >=", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLessThan(String value) {
            addCriterion("billing_type <", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLessThanOrEqualTo(String value) {
            addCriterion("billing_type <=", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeLike(String value) {
            addCriterion("billing_type like", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotLike(String value) {
            addCriterion("billing_type not like", value, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeIn(List<String> values) {
            addCriterion("billing_type in", values, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotIn(List<String> values) {
            addCriterion("billing_type not in", values, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeBetween(String value1, String value2) {
            addCriterion("billing_type between", value1, value2, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingTypeNotBetween(String value1, String value2) {
            addCriterion("billing_type not between", value1, value2, "billingType");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftIsNull() {
            addCriterion("billing_overdraft is null");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftIsNotNull() {
            addCriterion("billing_overdraft is not null");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftEqualTo(Integer value) {
            addCriterion("billing_overdraft =", value, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftNotEqualTo(Integer value) {
            addCriterion("billing_overdraft <>", value, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftGreaterThan(Integer value) {
            addCriterion("billing_overdraft >", value, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_overdraft >=", value, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftLessThan(Integer value) {
            addCriterion("billing_overdraft <", value, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftLessThanOrEqualTo(Integer value) {
            addCriterion("billing_overdraft <=", value, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftIn(List<Integer> values) {
            addCriterion("billing_overdraft in", values, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftNotIn(List<Integer> values) {
            addCriterion("billing_overdraft not in", values, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftBetween(Integer value1, Integer value2) {
            addCriterion("billing_overdraft between", value1, value2, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andBillingOverdraftNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_overdraft not between", value1, value2, "billingOverdraft");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeIsNull() {
            addCriterion("user_union_code is null");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeIsNotNull() {
            addCriterion("user_union_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeEqualTo(String value) {
            addCriterion("user_union_code =", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeNotEqualTo(String value) {
            addCriterion("user_union_code <>", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeGreaterThan(String value) {
            addCriterion("user_union_code >", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_union_code >=", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeLessThan(String value) {
            addCriterion("user_union_code <", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeLessThanOrEqualTo(String value) {
            addCriterion("user_union_code <=", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeLike(String value) {
            addCriterion("user_union_code like", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeNotLike(String value) {
            addCriterion("user_union_code not like", value, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeIn(List<String> values) {
            addCriterion("user_union_code in", values, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeNotIn(List<String> values) {
            addCriterion("user_union_code not in", values, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeBetween(String value1, String value2) {
            addCriterion("user_union_code between", value1, value2, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserUnionCodeNotBetween(String value1, String value2) {
            addCriterion("user_union_code not between", value1, value2, "userUnionCode");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNull() {
            addCriterion("user_contact is null");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNotNull() {
            addCriterion("user_contact is not null");
            return (Criteria) this;
        }

        public Criteria andUserContactEqualTo(String value) {
            addCriterion("user_contact =", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotEqualTo(String value) {
            addCriterion("user_contact <>", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThan(String value) {
            addCriterion("user_contact >", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact >=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThan(String value) {
            addCriterion("user_contact <", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThanOrEqualTo(String value) {
            addCriterion("user_contact <=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLike(String value) {
            addCriterion("user_contact like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotLike(String value) {
            addCriterion("user_contact not like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactIn(List<String> values) {
            addCriterion("user_contact in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotIn(List<String> values) {
            addCriterion("user_contact not in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactBetween(String value1, String value2) {
            addCriterion("user_contact between", value1, value2, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotBetween(String value1, String value2) {
            addCriterion("user_contact not between", value1, value2, "userContact");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Integer value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Integer value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Integer value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Integer value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Integer value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Integer> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Integer> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Integer value1, Integer value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("contract_status is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("contract_status is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(Integer value) {
            addCriterion("contract_status =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(Integer value) {
            addCriterion("contract_status <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(Integer value) {
            addCriterion("contract_status >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_status >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(Integer value) {
            addCriterion("contract_status <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(Integer value) {
            addCriterion("contract_status <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<Integer> values) {
            addCriterion("contract_status in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<Integer> values) {
            addCriterion("contract_status not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(Integer value1, Integer value2) {
            addCriterion("contract_status between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_status not between", value1, value2, "contractStatus");
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