package br.crm.vo.customer.cart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import br.crm.pojo.customer.cart.CustomerCart;
import br.crm.pojo.customer.patient.CustomerPatient;

public class CustomerCartVo extends CustomerCart implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sex;// 性别

	private String customerPatientName;// 姓名

	private String customerPatientPhone;// 联系电话

	private String IdCard;// 证件号码

	private String customerPatientId;// 体检人ID

	private String orderNo;// 订单号

	private String startExamTime;// 开始体检时间

	private String endExamTime;// 结束体检时间

	private String orderStatus;// 订单支付状态

    private String examTimeStr;//预约体检时间

	private List<CustomerPatient> customerList = new LinkedList<CustomerPatient>();// 体检人

	public String getExamTimeStr() {
		return examTimeStr;
	}

	public void setExamTimeStr(String examTimeStr) {
		this.examTimeStr = examTimeStr;
	}

	public List<CustomerPatient> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<CustomerPatient> customerList) {
		this.customerList = customerList;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStartExamTime() {
		return startExamTime;
	}

	public void setStartExamTime(String startExamTime) {
		this.startExamTime = startExamTime;
	}

	public String getEndExamTime() {
		return endExamTime;
	}

	public void setEndExamTime(String endExamTime) {
		this.endExamTime = endExamTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCustomerPatientName() {
		return customerPatientName;
	}

	public void setCustomerPatientName(String customerPatientName) {
		this.customerPatientName = customerPatientName;
	}

	public String getCustomerPatientPhone() {
		return customerPatientPhone;
	}

	public void setCustomerPatientPhone(String customerPatientPhone) {
		this.customerPatientPhone = customerPatientPhone;
	}

	public String getIdCard() {
		return IdCard;
	}

	public void setIdCard(String idCard) {
		IdCard = idCard;
	}

	public String getCustomerPatientId() {
		return customerPatientId;
	}

	public void setCustomerPatientId(String customerPatientId) {
		this.customerPatientId = customerPatientId;
	}

}
