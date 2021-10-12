package com.ktds.dto;

import com.ktds.model.Member;



public class MemberDto {
	
	private String member_id;
	private String member_pw;
	
	public static class LoginInfo{
		
		private String member_id;
		private String member_pw;
		
		
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
		
		
	}

}
