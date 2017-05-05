package br.crm.vo.firstdata;

import java.io.Serializable;

import br.crm.pojo.firstshow.Firstdatashow;

/**
 * 
 * @ClassName: FirstdatashowVo
 * @Description: TODO(首页展示的VO)
 * @author adminis
 * @date 2016年10月13日 下午2:08:43
 *
 */
public class FirstdatashowVo extends Firstdatashow implements Serializable {

	private String imgURL;//图片的URL
	
	private String orgName;//机构名称
	
	private String price;//价格
	
	private String discountPrice;//优惠价
	
	private String applies ;//适用
	
	private String suiteCount;//套餐数量

	public String getSuiteCount() {
		return suiteCount;
	}

	public void setSuiteCount(String suiteCount) {
		this.suiteCount = suiteCount;
	}

	public String getApplies() {
		return applies;
	}

	public void setApplies(String applies) {
		this.applies = applies;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	
}
