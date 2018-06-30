package com.mybatis.model;

public class ZwActionWithBLOBs extends ZwAction {
    private String coprName;

    private String singername;

    private String coprDesc;

    private String ftpLrcPath;

    private String ftpMp3Path;

    private String errStr;

    private String mp3HistoryPath;

    private String newMusicfilepath;

    private String delCopyrightids;

    public String getCoprName() {
        return coprName;
    }

    public void setCoprName(String coprName) {
        this.coprName = coprName == null ? null : coprName.trim();
    }

    public String getSingername() {
        return singername;
    }

    public void setSingername(String singername) {
        this.singername = singername == null ? null : singername.trim();
    }

    public String getCoprDesc() {
        return coprDesc;
    }

    public void setCoprDesc(String coprDesc) {
        this.coprDesc = coprDesc == null ? null : coprDesc.trim();
    }

    public String getFtpLrcPath() {
        return ftpLrcPath;
    }

    public void setFtpLrcPath(String ftpLrcPath) {
        this.ftpLrcPath = ftpLrcPath == null ? null : ftpLrcPath.trim();
    }

    public String getFtpMp3Path() {
        return ftpMp3Path;
    }

    public void setFtpMp3Path(String ftpMp3Path) {
        this.ftpMp3Path = ftpMp3Path == null ? null : ftpMp3Path.trim();
    }

    public String getErrStr() {
        return errStr;
    }

    public void setErrStr(String errStr) {
        this.errStr = errStr == null ? null : errStr.trim();
    }

    public String getMp3HistoryPath() {
        return mp3HistoryPath;
    }

    public void setMp3HistoryPath(String mp3HistoryPath) {
        this.mp3HistoryPath = mp3HistoryPath == null ? null : mp3HistoryPath.trim();
    }

    public String getNewMusicfilepath() {
        return newMusicfilepath;
    }

    public void setNewMusicfilepath(String newMusicfilepath) {
        this.newMusicfilepath = newMusicfilepath == null ? null : newMusicfilepath.trim();
    }

    public String getDelCopyrightids() {
        return delCopyrightids;
    }

    public void setDelCopyrightids(String delCopyrightids) {
        this.delCopyrightids = delCopyrightids == null ? null : delCopyrightids.trim();
    }
}