package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 *国家
 */
public class DictCountry implements Serializable {
    private Long countryId;

    private String countryKeys;

    private String countryName;

    private String countryCode;

    private String countryInputCode;

    private String countryLineOrder;

    private Integer countryStatus;

    private Date countryCreateTime;

    private Date countryUpdateTime;

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryKeys() {
        return countryKeys;
    }

    public void setCountryKeys(String countryKeys) {
        this.countryKeys = countryKeys == null ? null : countryKeys.trim();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getCountryInputCode() {
        return countryInputCode;
    }

    public void setCountryInputCode(String countryInputCode) {
        this.countryInputCode = countryInputCode == null ? null : countryInputCode.trim();
    }

    public String getCountryLineOrder() {
        return countryLineOrder;
    }

    public void setCountryLineOrder(String countryLineOrder) {
        this.countryLineOrder = countryLineOrder == null ? null : countryLineOrder.trim();
    }

    public Integer getCountryStatus() {
        return countryStatus;
    }

    public void setCountryStatus(Integer countryStatus) {
        this.countryStatus = countryStatus;
    }

    public Date getCountryCreateTime() {
        return countryCreateTime;
    }

    public void setCountryCreateTime(Date countryCreateTime) {
        this.countryCreateTime = countryCreateTime;
    }

    public Date getCountryUpdateTime() {
        return countryUpdateTime;
    }

    public void setCountryUpdateTime(Date countryUpdateTime) {
        this.countryUpdateTime = countryUpdateTime;
    }
}