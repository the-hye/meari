package com.ktds.controller;
import java.sql.Date;
import java.util.List;

import com.ktds.dto.MemberDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.mapper.MemberMapper;
import com.ktds.model.Member;

@RestController
public class MemberController {

	private MemberMapper mapper;


	public MemberController(MemberMapper mapper) {
		this.mapper = mapper;
	}

	
	@GetMapping("/user/{member_id}")
	public MemberDto getMember(@PathVariable("member_id") String member_id) {
		return mapper.getMember(member_id);
	}
	
	@GetMapping("/user/all")
	public List<Member> getMemberList(){
		return mapper.getMemberList();
	}

	@PostMapping("/user/member")
	public String postUserProfile(@RequestParam("member_id") String member_id,
			@RequestParam("member_email") String member_email,
			@RequestParam("member_pw") String member_pw,
			@RequestParam("member_pw_corr") String member_pw_corr,
			@RequestParam("member_name") String member_name,
			@RequestParam("member_age") Date member_age,) {
		mapper.insertMember(member_id, member_email, member_pw, member_pw_corr, member_name, member_age);
	
		return "login";
	}
	

	@DeleteMapping("/user/{member_id}")
	public void deleteUserProfile(@PathVariable("member_id") String member_id) {
		mapper.deleteMember(member_id);
	}


	/* Not Used Put Method
	@PutMapping("/user/{member_id}")
	public void putUserProfile(@PathVariable("member_id") String member_id,
			@RequestParam("member_pw") String member_pw,
			@RequestParam("member_name") String member_name,
			@RequestParam("member_sex") String member_sex,
			@RequestParam("member_age") int member_age,
			@RequestParam("member_email") String member_email,
			@RequestParam("member_rank") int member_rank,
			@RequestParam("member_image") String member_image,
			@RequestParam("member_content") String member_content){
			mapper.insertMember(member_id, member_pw, member_name, member_sex, member_age, member_email, member_rank, member_image, member_content);
	}	 */
	
	
}
