package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

public class Dictagegroup implements Serializable{
    private Integer agegroupId;

    private String agegroupName;

    private Integer agegroupUp;

    private Integer agegroupDown;

    private String agegroupText;

    private String agegroupOrder;

    private Date agegroupCreatetime;

    private Date agegroupUpdatetime;

    private Integer agegroupStatus;

    public Integer getAgegroupId() {
        return agegroupId;
    }

    public void setAgegroupId(Integer agegroupId) {
        this.agegroupId = agegroupId;
    }

    public String getAgegroupName() {
        return agegroupName;
    }

    public void setAgegroupName(String agegroupName) {
        this.agegroupName = agegroupName == null ? null : agegroupName.trim();
    }

    public Integer getAgegroupUp() {
        return agegroupUp;
    }

    public void setAgegroupUp(Integer agegroupUp) {
        this.agegroupUp = agegroupUp;
    }

    public Integer getAgegroupDown() {
        return agegroupDown;
    }

    public void setAgegroupDown(Integer agegroupDown) {
        this.agegroupDown = agegroupDown;
    }

    public String getAgegroupText() {
        return agegroupText;
    }

    public void setAgegroupText(String agegroupText) {
        this.agegroupText = agegroupText == null ? null : agegroupText.trim();
    }

    public String getAgegroupOrder() {
        return agegroupOrder;
    }

    public void setAgegroupOrder(String agegroupOrder) {
        this.agegroupOrder = agegroupOrder == null ? null : agegroupOrder.trim();
    }

    public Date getAgegroupCreatetime() {
        return agegroupCreatetime;
    }

    public void setAgegroupCreatetime(Date agegroupCreatetime) {
        this.agegroupCreatetime = agegroupCreatetime;
    }

    public Date getAgegroupUpdatetime() {
        return agegroupUpdatetime;
    }

    public void setAgegroupUpdatetime(Date agegroupUpdatetime) {
        this.agegroupUpdatetime = agegroupUpdatetime;
    }

    public Integer getAgegroupStatus() {
        return agegroupStatus;
    }

    public void setAgegroupStatus(Integer agegroupStatus) {
        this.agegroupStatus = agegroupStatus;
    }
}