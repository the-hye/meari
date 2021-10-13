package com.ktds.controller;
import java.util.List;

import com.ktds.model.Member;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.mapper.MemberMapper;

@RestController
public class MemberController {

	private MemberMapper mapper;

	public MemberController(MemberMapper mapper) {
		this.mapper = mapper;
	}

	
	@GetMapping("/user/{member_id}")
	public Member getMember(@PathVariable("member_id") String member_id) {
		return mapper.getMember(member_id);
	}
	
	@GetMapping("/user/all")
	public List<Member> getMemberList(){
		return mapper.getMemberList();
	}
	
	@PutMapping("/user/{member_id}")
	public void putUserProfile(@PathVariable("member_id") String member_id,
			@RequestParam("member_pw") String member_pw,
			@RequestParam("member_pw_corr") String member_pw_corr,
			@RequestParam("member_name") String member_name,
			@RequestParam("member_email") String member_email){
			mapper.insertMember(member_id, member_pw, member_pw_corr, member_name, member_email);
	
	
	}
	//signup form�� post method�� �޾ƿͼ� 
	//MemberMapper�� insertMember�� �Ѿ��.
	@PostMapping("/user/member")
	public String postUserProfile(@RequestParam("member_id") String member_id,
			@RequestParam("member_pw") String member_pw, 
			@RequestParam("member_name") String member_name,
			@RequestParam("member_pw_corr") String member_pw_corr,
			@RequestParam("member_email") String member_email) {
		mapper.insertMember(member_id, member_pw, member_pw_corr, member_name, member_email);
	
		return "login";
	}
	
//	@PostMapping("/user/login")
//	public String postMemberLogin(@RequestParam("member_id") String member_id,
//			@RequestParam("member_pew") String member_pw) {
//		mapper.loginMember(member_id, member_pw);
//	}
	
	@DeleteMapping("/user/{member_id}")
	public void deleteUserProfile(@PathVariable("member_id") String member_id) {
		mapper.deleteMember(member_id);
		
		
	}
	
	
}
