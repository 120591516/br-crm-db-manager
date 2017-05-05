package br.crm.vo.customer.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import br.crm.pojo.customer.order.CustomerOrder;
import br.crm.pojo.customer.patient.CustomerOrderReceipt;

/**
 * @ClassName: CustomerOrderVo
 * @Description: TODO
 * @author server
 * @date 2016年12月8日 上午10:56:01
 */
/**
 * @ClassName: CustomerOrderVo
 * @Description: TODO
 * @author server
 * @date 2016年12月8日 上午10:56:05
 */
public class CustomerOrderVo extends CustomerOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cartIds;
	private String cartId;// 购物车记录id

	private String orgId;// 机构
	private String orgName;// 机构名称
	private String branchId;// 门店id
	private String branchName;// 门店名称
	private String examSuiteId;// 套餐id
	private String examSuiteName;// 套餐名称
	private String cartStatus;// 购物车状态

	private String customerOrderStatusName;//订单状态名称
	private Date examTime;// 购物车体检时间
	private Date startExamTime;// 购物车的开始体检时间
	private Date endExamTime;// 购物车的开始体检时间
	private String customerCartImgId;// 购物车的图片id
	private String customerCartImgUrl;// 购物车的图片地址
	private String examType;// 体检类型(判断是否有enterpriseId，有团体，无个人)
	private String refund;//判断是否退款（支付宝支付，订单状态是33，退款表有订单记录，0、满足条件1、不满足条件）
	private String singlePrice;// 单价
	private String utilPriceStart;// 开始价位
	private String utilPriceEnd;// 结束价位

	private String customerPatientName;// 体检者姓名
	private String customerPatientPhone;// 体检者电话
	private String customerPatientIdCard;// 体检者身份证号
	
	private Integer idReceiptType;//发票类型表id
	private Integer patientReceiptType;//抬头类型（1、个人2、企业）
	private String patientReceiptName;//抬头名称
	private String patientReceiptContent;//抬头内容
	
	private String receipttypeName;//发票类型名称
	private String receipttypeCode;//发票类型代码	
	private BigDecimal patientReceiptPrice;

	private CustomerOrderReceipt customerOrderReceipt;
	
	
	public String getRefound() {
		return refund;
	}

	public void setRefound(String refound) {
		this.refund = refound;
	}

	public BigDecimal getPatientReceiptPrice() {
		return patientReceiptPrice;
	}

	public void setPatientReceiptPrice(BigDecimal patientReceiptPrice) {
		this.patientReceiptPrice = patientReceiptPrice;
	}	

	public String getReceipttypeName() {
		return receipttypeName;
	}

	public void setReceipttypeName(String receipttypeName) {
		this.receipttypeName = receipttypeName;
	}

	public String getReceipttypeCode() {
		return receipttypeCode;
	}

	public void setReceipttypeCode(String receipttypeCode) {
		this.receipttypeCode = receipttypeCode;
	}

	public Integer getIdReceiptType() {
		return idReceiptType;
	}

	public void setIdReceiptType(Integer idReceiptType) {
		this.idReceiptType = idReceiptType;
	}

	public Integer getPatientReceiptType() {
		return patientReceiptType;
	}

	public void setPatientReceiptType(Integer patientReceiptType) {
		this.patientReceiptType = patientReceiptType;
	}

	public String getPatientReceiptName() {
		return patientReceiptName;
	}

	public void setPatientReceiptName(String patientReceiptName) {
		this.patientReceiptName = patientReceiptName;
	}

	public String getPatientReceiptContent() {
		return patientReceiptContent;
	}

	public void setPatientReceiptContent(String patientReceiptContent) {
		this.patientReceiptContent = patientReceiptContent;
	}

	public String getCustomerOrderStatusName() {
		return customerOrderStatusName;
	}

	public void setCustomerOrderStatusName(String customerOrderStatusName) {
		this.customerOrderStatusName = customerOrderStatusName;
	}

	public CustomerOrderReceipt getCustomerOrderReceipt() {
		return customerOrderReceipt;
	}

	public void setCustomerOrderReceipt(CustomerOrderReceipt customerOrderReceipt) {
		this.customerOrderReceipt = customerOrderReceipt;
	}

	public String getUtilPriceStart() {
		return utilPriceStart;
	}

	public void setUtilPriceStart(String utilPriceStart) {
		this.utilPriceStart = utilPriceStart;
	}

	public String getUtilPriceEnd() {
		return utilPriceEnd;
	}

	public void setUtilPriceEnd(String utilPriceEnd) {
		this.utilPriceEnd = utilPriceEnd;
	}

	public String getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(String singlePrice) {
		this.singlePrice = singlePrice;
	}

	public Date getStartExamTime() {
		return startExamTime;
	}

	public void setStartExamTime(Date startExamTime) {
		this.startExamTime = startExamTime;
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

	public String getCustomerPatientIdCard() {
		return customerPatientIdCard;
	}

	public void setCustomerPatientIdCard(String customerPatientIdCard) {
		this.customerPatientIdCard = customerPatientIdCard;
	}


	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public Date getEndExamTime() {
		return endExamTime;
	}

	public void setEndExamTime(Date endExamTime) {
		this.endExamTime = endExamTime;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	
	public String getCustomerCartImgId() {
		return customerCartImgId;
	}

	public void setCustomerCartImgId(String customerCartImgId) {
		this.customerCartImgId = customerCartImgId;
	}

	public String getCustomerCartImgUrl() {
		return customerCartImgUrl;
	}

	public void setCustomerCartImgUrl(String customerCartImgUrl) {
		this.customerCartImgUrl = customerCartImgUrl;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getExamSuiteId() {
		return examSuiteId;
	}

	public void setExamSuiteId(String examSuiteId) {
		this.examSuiteId = examSuiteId;
	}

	public String getExamSuiteName() {
		return examSuiteName;
	}

	public void setExamSuiteName(String examSuiteName) {
		this.examSuiteName = examSuiteName;
	}

	public String getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}

	public String getCartIds() {
		return cartIds;
	}

	public void setCartIds(String cartIds) {
		this.cartIds = cartIds;
	}

	public Date getExamTime() {
		return examTime;
	}

	public void setExamTime(Date examTime) {
		this.examTime = examTime;
	}

}
