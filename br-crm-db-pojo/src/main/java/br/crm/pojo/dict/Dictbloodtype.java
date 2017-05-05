package br.crm.pojo.dict;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 血型
 */
public class Dictbloodtype implements Serializable {
	private Integer idBloodtype;

	private String keybloodtype;

	private String bloodtypeName;

	private String bloodtypeCode;

	private String inputCode;

	private String bloodtypecodex;

	private String note;

	private Date bloodtypeCreatetime;

	private Date bloodtypeUpdatetime;

	private Integer bloodtypeStatus;

	public Integer getIdBloodtype() {
		return idBloodtype;
	}

	public void setIdBloodtype(Integer idBloodtype) {
		this.idBloodtype = idBloodtype;
	}

	public String getKeybloodtype() {
		return keybloodtype;
	}

	public void setKeybloodtype(String keybloodtype) {
		this.keybloodtype = keybloodtype == null ? null : keybloodtype.trim();
	}

	public String getBloodtypeName() {
		return bloodtypeName;
	}

	public void setBloodtypeName(String bloodtypeName) {
		this.bloodtypeName = bloodtypeName == null ? null : bloodtypeName.trim();
	}

	public String getBloodtypeCode() {
		return bloodtypeCode;
	}

	public void setBloodtypeCode(String bloodtypeCode) {
		this.bloodtypeCode = bloodtypeCode == null ? null : bloodtypeCode.trim();
	}

	public String getInputCode() {
		return inputCode;
	}

	public void setInputCode(String inputCode) {
		this.inputCode = inputCode == null ? null : inputCode.trim();
	}

	public String getBloodtypecodex() {
		return bloodtypecodex;
	}

	public void setBloodtypecodex(String bloodtypecodex) {
		this.bloodtypecodex = bloodtypecodex == null ? null : bloodtypecodex.trim();
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	public Date getBloodtypeCreatetime() {
		return bloodtypeCreatetime;
	}

	public void setBloodtypeCreatetime(Date bloodtypeCreatetime) {
		this.bloodtypeCreatetime = bloodtypeCreatetime;
	}

	public Date getBloodtypeUpdatetime() {
		return bloodtypeUpdatetime;
	}

	public void setBloodtypeUpdatetime(Date bloodtypeUpdatetime) {
		this.bloodtypeUpdatetime = bloodtypeUpdatetime;
	}

	public Integer getBloodtypeStatus() {
		return bloodtypeStatus;
	}

	public void setBloodtypeStatus(Integer bloodtypeStatus) {
		this.bloodtypeStatus = bloodtypeStatus;
	}
}