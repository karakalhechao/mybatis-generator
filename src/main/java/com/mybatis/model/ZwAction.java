package com.mybatis.model;

import java.util.Date;

public class ZwAction {
    private Integer id;

    private String did;

    private String transId;

    private String coprId;

    private String actionType;

    private Date createTime;

    private String status;

    private Integer isbatch;

    private String musicId;

    private String zwczType;

    private String hmdType;

    private String zwCode;

    private Integer auditStatus;

    private Integer songTimes;

    private String newCopyrightid;

    private Date updateTime;

    private String auditPerson;

    private Integer priority;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did == null ? null : did.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getCoprId() {
        return coprId;
    }

    public void setCoprId(String coprId) {
        this.coprId = coprId == null ? null : coprId.trim();
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getIsbatch() {
        return isbatch;
    }

    public void setIsbatch(Integer isbatch) {
        this.isbatch = isbatch;
    }

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId == null ? null : musicId.trim();
    }

    public String getZwczType() {
        return zwczType;
    }

    public void setZwczType(String zwczType) {
        this.zwczType = zwczType == null ? null : zwczType.trim();
    }

    public String getHmdType() {
        return hmdType;
    }

    public void setHmdType(String hmdType) {
        this.hmdType = hmdType == null ? null : hmdType.trim();
    }

    public String getZwCode() {
        return zwCode;
    }

    public void setZwCode(String zwCode) {
        this.zwCode = zwCode == null ? null : zwCode.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getSongTimes() {
        return songTimes;
    }

    public void setSongTimes(Integer songTimes) {
        this.songTimes = songTimes;
    }

    public String getNewCopyrightid() {
        return newCopyrightid;
    }

    public void setNewCopyrightid(String newCopyrightid) {
        this.newCopyrightid = newCopyrightid == null ? null : newCopyrightid.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson == null ? null : auditPerson.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}