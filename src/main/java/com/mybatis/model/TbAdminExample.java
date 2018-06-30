package com.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNull() {
            addCriterion("encrypt is null");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNotNull() {
            addCriterion("encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptEqualTo(String value) {
            addCriterion("encrypt =", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotEqualTo(String value) {
            addCriterion("encrypt <>", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThan(String value) {
            addCriterion("encrypt >", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("encrypt >=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThan(String value) {
            addCriterion("encrypt <", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThanOrEqualTo(String value) {
            addCriterion("encrypt <=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLike(String value) {
            addCriterion("encrypt like", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotLike(String value) {
            addCriterion("encrypt not like", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptIn(List<String> values) {
            addCriterion("encrypt in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotIn(List<String> values) {
            addCriterion("encrypt not in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptBetween(String value1, String value2) {
            addCriterion("encrypt between", value1, value2, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotBetween(String value1, String value2) {
            addCriterion("encrypt not between", value1, value2, "encrypt");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andBuiltinIsNull() {
            addCriterion("builtin is null");
            return (Criteria) this;
        }

        public Criteria andBuiltinIsNotNull() {
            addCriterion("builtin is not null");
            return (Criteria) this;
        }

        public Criteria andBuiltinEqualTo(Byte value) {
            addCriterion("builtin =", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinNotEqualTo(Byte value) {
            addCriterion("builtin <>", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinGreaterThan(Byte value) {
            addCriterion("builtin >", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinGreaterThanOrEqualTo(Byte value) {
            addCriterion("builtin >=", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinLessThan(Byte value) {
            addCriterion("builtin <", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinLessThanOrEqualTo(Byte value) {
            addCriterion("builtin <=", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinIn(List<Byte> values) {
            addCriterion("builtin in", values, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinNotIn(List<Byte> values) {
            addCriterion("builtin not in", values, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinBetween(Byte value1, Byte value2) {
            addCriterion("builtin between", value1, value2, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinNotBetween(Byte value1, Byte value2) {
            addCriterion("builtin not between", value1, value2, "builtin");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledIsNull() {
            addCriterion("admin_enabled is null");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledIsNotNull() {
            addCriterion("admin_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledEqualTo(Byte value) {
            addCriterion("admin_enabled =", value, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledNotEqualTo(Byte value) {
            addCriterion("admin_enabled <>", value, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledGreaterThan(Byte value) {
            addCriterion("admin_enabled >", value, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("admin_enabled >=", value, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledLessThan(Byte value) {
            addCriterion("admin_enabled <", value, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("admin_enabled <=", value, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledIn(List<Byte> values) {
            addCriterion("admin_enabled in", values, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledNotIn(List<Byte> values) {
            addCriterion("admin_enabled not in", values, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledBetween(Byte value1, Byte value2) {
            addCriterion("admin_enabled between", value1, value2, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("admin_enabled not between", value1, value2, "adminEnabled");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNull() {
            addCriterion("admin_status is null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNotNull() {
            addCriterion("admin_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusEqualTo(Byte value) {
            addCriterion("admin_status =", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotEqualTo(Byte value) {
            addCriterion("admin_status <>", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThan(Byte value) {
            addCriterion("admin_status >", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("admin_status >=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThan(Byte value) {
            addCriterion("admin_status <", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThanOrEqualTo(Byte value) {
            addCriterion("admin_status <=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIn(List<Byte> values) {
            addCriterion("admin_status in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotIn(List<Byte> values) {
            addCriterion("admin_status not in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusBetween(Byte value1, Byte value2) {
            addCriterion("admin_status between", value1, value2, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("admin_status not between", value1, value2, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminDescIsNull() {
            addCriterion("admin_desc is null");
            return (Criteria) this;
        }

        public Criteria andAdminDescIsNotNull() {
            addCriterion("admin_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAdminDescEqualTo(String value) {
            addCriterion("admin_desc =", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescNotEqualTo(String value) {
            addCriterion("admin_desc <>", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescGreaterThan(String value) {
            addCriterion("admin_desc >", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescGreaterThanOrEqualTo(String value) {
            addCriterion("admin_desc >=", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescLessThan(String value) {
            addCriterion("admin_desc <", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescLessThanOrEqualTo(String value) {
            addCriterion("admin_desc <=", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescLike(String value) {
            addCriterion("admin_desc like", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescNotLike(String value) {
            addCriterion("admin_desc not like", value, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescIn(List<String> values) {
            addCriterion("admin_desc in", values, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescNotIn(List<String> values) {
            addCriterion("admin_desc not in", values, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescBetween(String value1, String value2) {
            addCriterion("admin_desc between", value1, value2, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminDescNotBetween(String value1, String value2) {
            addCriterion("admin_desc not between", value1, value2, "adminDesc");
            return (Criteria) this;
        }

        public Criteria andAdminUnitIsNull() {
            addCriterion("admin_unit is null");
            return (Criteria) this;
        }

        public Criteria andAdminUnitIsNotNull() {
            addCriterion("admin_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUnitEqualTo(String value) {
            addCriterion("admin_unit =", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitNotEqualTo(String value) {
            addCriterion("admin_unit <>", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitGreaterThan(String value) {
            addCriterion("admin_unit >", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitGreaterThanOrEqualTo(String value) {
            addCriterion("admin_unit >=", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitLessThan(String value) {
            addCriterion("admin_unit <", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitLessThanOrEqualTo(String value) {
            addCriterion("admin_unit <=", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitLike(String value) {
            addCriterion("admin_unit like", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitNotLike(String value) {
            addCriterion("admin_unit not like", value, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitIn(List<String> values) {
            addCriterion("admin_unit in", values, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitNotIn(List<String> values) {
            addCriterion("admin_unit not in", values, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitBetween(String value1, String value2) {
            addCriterion("admin_unit between", value1, value2, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAdminUnitNotBetween(String value1, String value2) {
            addCriterion("admin_unit not between", value1, value2, "adminUnit");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledIsNull() {
            addCriterion("auto_audit_enabled is null");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledIsNotNull() {
            addCriterion("auto_audit_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledEqualTo(String value) {
            addCriterion("auto_audit_enabled =", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledNotEqualTo(String value) {
            addCriterion("auto_audit_enabled <>", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledGreaterThan(String value) {
            addCriterion("auto_audit_enabled >", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("auto_audit_enabled >=", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledLessThan(String value) {
            addCriterion("auto_audit_enabled <", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledLessThanOrEqualTo(String value) {
            addCriterion("auto_audit_enabled <=", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledLike(String value) {
            addCriterion("auto_audit_enabled like", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledNotLike(String value) {
            addCriterion("auto_audit_enabled not like", value, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledIn(List<String> values) {
            addCriterion("auto_audit_enabled in", values, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledNotIn(List<String> values) {
            addCriterion("auto_audit_enabled not in", values, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledBetween(String value1, String value2) {
            addCriterion("auto_audit_enabled between", value1, value2, "autoAuditEnabled");
            return (Criteria) this;
        }

        public Criteria andAutoAuditEnabledNotBetween(String value1, String value2) {
            addCriterion("auto_audit_enabled not between", value1, value2, "autoAuditEnabled");
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