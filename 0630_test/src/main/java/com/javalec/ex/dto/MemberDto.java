package com.javalec.ex.dto;

public class MemberDto {

	private String mid;
	private String mpw;
	private int mphone1;
	private int mphone2;
	private int mphone3;
	private String memail1;
	private String memail2;
	private int mpost;
	private String maddress1;
	private String maddress2;
	private String msns;
	private String mmsg;
	public MemberDto() {}
	public MemberDto(String mid, String mpw, int mphone1, int mphone2, int mphone3, String memail1, String memail2,
			int mpost, String maddress1, String maddress2, String msns, String mmsg) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.mphone1 = mphone1;
		this.mphone2 = mphone2;
		this.mphone3 = mphone3;
		this.memail1 = memail1;
		this.memail2 = memail2;
		this.mpost = mpost;
		this.maddress1 = maddress1;
		this.maddress2 = maddress2;
		this.msns = msns;
		this.mmsg = mmsg;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public int getMphone1() {
		return mphone1;
	}
	public void setMphone1(int mphone1) {
		this.mphone1 = mphone1;
	}
	public int getMphone2() {
		return mphone2;
	}
	public void setMphone2(int mphone2) {
		this.mphone2 = mphone2;
	}
	public int getMphone3() {
		return mphone3;
	}
	public void setMphone3(int mphone3) {
		this.mphone3 = mphone3;
	}
	public String getMemail1() {
		return memail1;
	}
	public void setMemail1(String memail1) {
		this.memail1 = memail1;
	}
	public String getMemail2() {
		return memail2;
	}
	public void setMemail2(String memail2) {
		this.memail2 = memail2;
	}
	public int getMpost() {
		return mpost;
	}
	public void setMpost(int mpost) {
		this.mpost = mpost;
	}
	public String getMaddress1() {
		return maddress1;
	}
	public void setMaddress1(String maddress1) {
		this.maddress1 = maddress1;
	}
	public String getMaddress2() {
		return maddress2;
	}
	public void setMaddress2(String maddress2) {
		this.maddress2 = maddress2;
	}
	public String getMsns() {
		return msns;
	}
	public void setMsns(String msns) {
		this.msns = msns;
	}
	public String getMmsg() {
		return mmsg;
	}
	public void setMmsg(String mmsg) {
		this.mmsg = mmsg;
	}
	
	
	
	
	
}
