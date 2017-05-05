/**   
* @Title: OrgExamSuiteImgVo.java 
* @Package br.crm.vo.suite 
* @Description: TODO
* @author kangting   
* @date 2016年10月18日 下午2:06:15 
* @version V1.0   
*/
package br.crm.vo.suite;

import java.io.Serializable;

/** 
 * @ClassName: OrgExamSuiteImgVo 套餐图片信息
 * @Description: TODO
 * @author kangting
 * @date 2016年10月18日 下午2:06:15 
 *  
 */
public class OrgExamSuiteImgVo implements Serializable{
	private String orgExamSuiteImgId;
	private Long dictImgId;
	private String imgName;
	private String imgLocation;
	public String getOrgExamSuiteImgId() {
		return orgExamSuiteImgId;
	}
	public void setOrgExamSuiteImgId(String orgExamSuiteImgId) {
		this.orgExamSuiteImgId = orgExamSuiteImgId;
	}
	public Long getDictImgId() {
		return dictImgId;
	}
	public void setDictImgId(Long dictImgId) {
		this.dictImgId = dictImgId;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgLocation() {
		return imgLocation;
	}
	public void setImgLocation(String imgLocation) {
		this.imgLocation = imgLocation;
	}
	

}
