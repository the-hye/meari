package com.ktds.model;


public class Member {
	private String member_id;  
	private String member_pw;
	private String member_name;
	private String member_sex;
	private int member_age;
	private String member_email;
	private int member_rank;
	private String member_image;
	private String member_content;
	
	//Constructor
	public Member(String member_id, String member_pw, String member_name, String member_sex, int member_age,
			String member_email, int member_rank, String member_image, String member_content) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.member_sex = member_sex;
		this.member_age = member_age;
		this.member_email = member_email;
		this.member_rank = member_rank;
		this.member_image = member_image;
		this.member_content = member_content;
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

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_sex() {
		return member_sex;
	}

	public void setMember_sex(String member_sex) {
		this.member_sex = member_sex;
	}

	public int getMember_age() {
		return member_age;
	}

	public void setMember_age(int member_age) {
		this.member_age = member_age;
	}

	public int getMember_rank() {
		return member_rank;
	}

	public void setMember_rank(int member_rank) {
		this.member_rank = member_rank;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_image() {
		return member_image;
	}

	public void setMember_image(String member_image) {
		this.member_image = member_image;
	}

	public String getMember_content() {
		return member_content;
	}

	public void setMember_content(String member_content) {
		this.member_content = member_content;
	}
	
	

	

}
