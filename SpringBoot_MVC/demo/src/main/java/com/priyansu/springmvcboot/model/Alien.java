package com.priyansu.springmvcboot.model;

public class Alien {
	private int aid;
	private String aname;
	
	
	/**
	 *  Getter and Setter for "aid" & "aname"
	 */
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	/**
	 * toString() for field "aid" & "aname"
	 */
	@Override
	public String toString() {
		return "Alien [aid= " + aid + ", aname= " + aname + "]";
	}	
}
