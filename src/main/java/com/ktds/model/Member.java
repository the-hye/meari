package com.ktds.model;

//MemberVO ����
public class Member {
	private String member_id;  
	private String member_pw;
	private String member_pw_corr;
	private String member_name;
	private String member_email;
	
	//Constructor
	public Member(String member_id, String member_pw, String member_pw_corr, String member_name, String member_email) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_pw_corr = member_pw_corr;
		this.member_name = member_name;
		this.member_email = member_email;
	}
	
	
	
	//Getters and Setters
	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_pw_corr() {
		return member_pw_corr;
	}

	public void setMember_pw_corr(String member_pw_corr) {
		this.member_pw_corr = member_pw_corr;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	
	

	

}
