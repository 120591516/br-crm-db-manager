package br.crm.pojo.customer.order;

import java.io.Serializable;
import java.util.Date;

public class CustomerOrderStatus implements Serializable{
    private Integer customerOrderStatusId;

    private String customerOrderStatusName;

    private Date customerOrderStatusCreateTime;

    private Date customerOrderStatusEditTime;

    public Integer getCustomerOrderStatusId() {
        return customerOrderStatusId;
    }

    public void setCustomerOrderStatusId(Integer customerOrderStatusId) {
        this.customerOrderStatusId = customerOrderStatusId;
    }

    public String getCustomerOrderStatusName() {
        return customerOrderStatusName;
    }

    public void setCustomerOrderStatusName(String customerOrderStatusName) {
        this.customerOrderStatusName = customerOrderStatusName == null ? null : customerOrderStatusName.trim();
    }

    public Date getCustomerOrderStatusCreateTime() {
        return customerOrderStatusCreateTime;
    }

    public void setCustomerOrderStatusCreateTime(Date customerOrderStatusCreateTime) {
        this.customerOrderStatusCreateTime = customerOrderStatusCreateTime;
    }

    public Date getCustomerOrderStatusEditTime() {
        return customerOrderStatusEditTime;
    }

    public void setCustomerOrderStatusEditTime(Date customerOrderStatusEditTime) {
        this.customerOrderStatusEditTime = customerOrderStatusEditTime;
    }
}