package com.mybatis.model;

import java.util.Date;

public class ZwBlacklist {
    private Long id;

    private String blacklistid;

    private String repeatid;

    private String type;

    private Date ctime;

    private Date utime;

    private Date dtime;

    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlacklistid() {
        return blacklistid;
    }

    public void setBlacklistid(String blacklistid) {
        this.blacklistid = blacklistid == null ? null : blacklistid.trim();
    }

    public String getRepeatid() {
        return repeatid;
    }

    public void setRepeatid(String repeatid) {
        this.repeatid = repeatid == null ? null : repeatid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}