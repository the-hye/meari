package com.ktds.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.ktds.dto.MemberDto;
import com.ktds.model.Member;
import com.ktds.model.MembershipService;


//Test 진행중...
public class MembershipController {

	
	
	private MembershipService membershipService;
	

	
	
	//로그인(POST)
	@PostMapping("/user/login")
	public String postLogin(HttpSession session, MemberDto.LoginInfo member, Model model) {
		if(session.getAttribute("login") != null) {
			session.removeAttribute("login");
		}
		
		Member loginMember = membershipService.loginCheck(member);
	
	
	if (loginMember != null) {
		session.setAttribute("login", loginMember);
		return "success login";
	}
	else {
		return "fail login";
	}
	}
}
	
	
	
	
	

