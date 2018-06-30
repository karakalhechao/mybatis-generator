package com.mybatis.model;

import java.util.Date;

public class ZwLog {
    private Integer id;

    private Date createTime;

    private String did;

    private String transid;

    private Integer action;

    private String errCode;

    private String errStr;

    private String zwCode;

    private String zwStr;

    private String coprId;

    private String repeatCoprIds;

    private String reportJson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did == null ? null : did.trim();
    }

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid == null ? null : transid.trim();
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    public String getErrStr() {
        return errStr;
    }

    public void setErrStr(String errStr) {
        this.errStr = errStr == null ? null : errStr.trim();
    }

    public String getZwCode() {
        return zwCode;
    }

    public void setZwCode(String zwCode) {
        this.zwCode = zwCode == null ? null : zwCode.trim();
    }

    public String getZwStr() {
        return zwStr;
    }

    public void setZwStr(String zwStr) {
        this.zwStr = zwStr == null ? null : zwStr.trim();
    }

    public String getCoprId() {
        return coprId;
    }

    public void setCoprId(String coprId) {
        this.coprId = coprId == null ? null : coprId.trim();
    }

    public String getRepeatCoprIds() {
        return repeatCoprIds;
    }

    public void setRepeatCoprIds(String repeatCoprIds) {
        this.repeatCoprIds = repeatCoprIds == null ? null : repeatCoprIds.trim();
    }

    public String getReportJson() {
        return reportJson;
    }

    public void setReportJson(String reportJson) {
        this.reportJson = reportJson == null ? null : reportJson.trim();
    }
}