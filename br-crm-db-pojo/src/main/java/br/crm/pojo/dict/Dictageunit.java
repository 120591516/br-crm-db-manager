package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

/**
 * 年龄单位
 *
 */
public class Dictageunit implements Serializable {
	private Integer ageunitId;

	private String ageunitKey;

	private String ageunitName;

	private String ageunitCode;

	private String inputCode;

	private String note;

	private String ageunitcodex;

	private Date ageunitCreatetime;

	private Date ageunitUpdatetime;

	private Integer ageunitStatus;

	public Integer getAgeunitId() {
		return ageunitId;
	}

	public void setAgeunitId(Integer ageunitId) {
		this.ageunitId = ageunitId;
	}

	public String getAgeunitKey() {
		return ageunitKey;
	}

	public void setAgeunitKey(String ageunitKey) {
		this.ageunitKey = ageunitKey == null ? null : ageunitKey.trim();
	}

	public String getAgeunitName() {
		return ageunitName;
	}

	public void setAgeunitName(String ageunitName) {
		this.ageunitName = ageunitName == null ? null : ageunitName.trim();
	}

	public String getAgeunitCode() {
		return ageunitCode;
	}

	public void setAgeunitCode(String ageunitCode) {
		this.ageunitCode = ageunitCode == null ? null : ageunitCode.trim();
	}

	public String getInputCode() {
		return inputCode;
	}

	public void setInputCode(String inputCode) {
		this.inputCode = inputCode == null ? null : inputCode.trim();
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	public String getAgeunitcodex() {
		return ageunitcodex;
	}

	public void setAgeunitcodex(String ageunitcodex) {
		this.ageunitcodex = ageunitcodex == null ? null : ageunitcodex.trim();
	}

	public Date getAgeunitCreatetime() {
		return ageunitCreatetime;
	}

	public void setAgeunitCreatetime(Date ageunitCreatetime) {
		this.ageunitCreatetime = ageunitCreatetime;
	}

	public Date getAgeunitUpdatetime() {
		return ageunitUpdatetime;
	}

	public void setAgeunitUpdatetime(Date ageunitUpdatetime) {
		this.ageunitUpdatetime = ageunitUpdatetime;
	}

	public Integer getAgeunitStatus() {
		return ageunitStatus;
	}

	public void setAgeunitStatus(Integer ageunitStatus) {
		this.ageunitStatus = ageunitStatus;
	}
}