package br.crm.vo.org;

import java.io.Serializable;
import java.util.List;

import br.crm.pojo.org.OrganizationConn;
import br.crm.pojo.org.OrganizationCooperation;
import br.crm.pojo.org.OrganizationIncome;
import br.crm.pojo.org.OrganizationInvest;
import br.crm.pojo.org.OrganizationSale;
import br.crm.pojo.org.OrganizationSoft;
import br.crm.pojo.org.OrganizationVisit;
import br.crm.pojo.org.OrganizationWeb;

public class OrganizationAllInfoVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OrganizationVo organizationVo;
	private List<OrganizationConn> organizationConns;
	private List<OrganizationCooperation> organizationCooperations;
	private List<OrganizationIncome> organizationIncomes;
	private List<OrganizationInvest> organizationInvests;
	private List<OrganizationSale> organizationSales;
	private List<OrganizationSoft> organizationSofts;
	private List<OrganizationVisit> organizationVisits;
	private List<OrganizationWeb> organizationWebs;
	
	
	public OrganizationVo getOrganizationVo() {
		return organizationVo;
	}
	public void setOrganizationVo(OrganizationVo organizationVo) {
		this.organizationVo = organizationVo;
	}
	public List<OrganizationConn> getOrganizationConns() {
		return organizationConns;
	}
	public void setOrganizationConns(List<OrganizationConn> organizationConns) {
		this.organizationConns = organizationConns;
	}
	public List<OrganizationCooperation> getOrganizationCooperations() {
		return organizationCooperations;
	}
	public void setOrganizationCooperations(List<OrganizationCooperation> organizationCooperations) {
		this.organizationCooperations = organizationCooperations;
	}
	public List<OrganizationIncome> getOrganizationIncomes() {
		return organizationIncomes;
	}
	public void setOrganizationIncomes(List<OrganizationIncome> organizationIncomes) {
		this.organizationIncomes = organizationIncomes;
	}
	public List<OrganizationInvest> getOrganizationInvests() {
		return organizationInvests;
	}
	public void setOrganizationInvests(List<OrganizationInvest> organizationInvests) {
		this.organizationInvests = organizationInvests;
	}
	public List<OrganizationSale> getOrganizationSales() {
		return organizationSales;
	}
	public void setOrganizationSales(List<OrganizationSale> organizationSales) {
		this.organizationSales = organizationSales;
	}
	public List<OrganizationSoft> getOrganizationSofts() {
		return organizationSofts;
	}
	public void setOrganizationSofts(List<OrganizationSoft> organizationSofts) {
		this.organizationSofts = organizationSofts;
	}
	public List<OrganizationVisit> getOrganizationVisits() {
		return organizationVisits;
	}
	public void setOrganizationVisits(List<OrganizationVisit> organizationVisits) {
		this.organizationVisits = organizationVisits;
	}
	public List<OrganizationWeb> getOrganizationWebs() {
		return organizationWebs;
	}
	public void setOrganizationWebs(List<OrganizationWeb> organizationWebs) {
		this.organizationWebs = organizationWebs;
	}
	
	
}
