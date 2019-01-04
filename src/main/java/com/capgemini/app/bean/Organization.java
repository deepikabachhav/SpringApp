package com.capgemini.app.bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Organization {

	private int orgId;
	private String name;
	private Set<String> cities;
	private List<String> boardMembers;
	private Map<String, String> branchManagers;
	private LocalDate dateOfEstablishment;
	private double shareValue;
	private boolean listed;
	private Properties ipAddresses;
	
	public Organization() {
		super();
	}
	
	public Organization(int orgId, String name) {
		super();
		this.orgId = orgId;
		this.name = name;
	}
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	
	public int getOrgId() {
		System.out.println("Organization ID :"  + orgId);
		return orgId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.println("Organization Name : " +name);
		return name;
	}
	
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	
	public Set<String> getCities() {
		System.out.println("Set Elements :"  + cities);
		return cities;
	}
	
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}
	
	public List<String> getBoardMembers() {
		System.out.println("List Elements :"  + boardMembers);
		return boardMembers;
	}
	
	public void setBranchManagers(Map<String, String> branchManagers) {
		this.branchManagers = branchManagers;
	}
	
	public Map<String, String> getBranchManagers() {
		System.out.println("Map Elements :"  + branchManagers);
		return branchManagers;
	}
	
	public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}
	
	public LocalDate getDateOfEstablishment() {
		System.out.println("Date Of Establishment : "+dateOfEstablishment);
		return dateOfEstablishment;
	}
	
	public void setShareValue(double shareValue) {
		this.shareValue = shareValue;
	}
	
	public double getShareValue() {
		System.out.println("Share Value : "+shareValue);
		return shareValue;
	}
	

	public void setListed(boolean listed) {
		this.listed = listed;
	}
	
	public boolean isListed() {
		System.out.println("Listed ? :"+listed);
		return listed;
	}
	
	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	} 
	
	public Properties getIpAddresses() {
		System.out.println("IP Address : "+ipAddresses);
		return ipAddresses;
	}
	
	
	
	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", name=" + name + ", cities=" + cities + ", boardMembers="
				+ boardMembers + ", branchManagers=" + branchManagers + ", dateOfEstablishment=" + dateOfEstablishment
				+ ", shareValue=" + shareValue + ", listed=" + listed + ", ipAddresses=" + ipAddresses + "]";
	}
}
