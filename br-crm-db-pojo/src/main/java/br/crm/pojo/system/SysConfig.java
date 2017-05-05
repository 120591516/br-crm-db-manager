package br.crm.pojo.system;

import java.io.Serializable;

public class SysConfig implements Serializable{
    private String sysConfigId;

    private String sysConfigRedis;

    private String sysConfigSearch;

    public String getSysConfigId() {
        return sysConfigId;
    }

    public void setSysConfigId(String sysConfigId) {
        this.sysConfigId = sysConfigId == null ? null : sysConfigId.trim();
    }

    public String getSysConfigRedis() {
        return sysConfigRedis;
    }

    public void setSysConfigRedis(String sysConfigRedis) {
        this.sysConfigRedis = sysConfigRedis == null ? null : sysConfigRedis.trim();
    }

    public String getSysConfigSearch() {
        return sysConfigSearch;
    }

    public void setSysConfigSearch(String sysConfigSearch) {
        this.sysConfigSearch = sysConfigSearch == null ? null : sysConfigSearch.trim();
    }
}