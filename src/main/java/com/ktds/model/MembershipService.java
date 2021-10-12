package com.ktds.model;

import com.ktds.dto.MemberDto;
import com.ktds.mapper.MemberMapper;


public class MembershipService {

	
	private MemberMapper mapper;
	

	public MembershipService(MemberMapper mapper) {
		this.mapper = mapper;
	}

	
	public Member loginCheck(MemberDto.LoginInfo memberdto) {
		Member member = mapper.getMember(memberdto.getMember_id());
	if(memberdto.getMember_pw().equals(member.getMember_pw())) {
		return member;
	}
	else {
		return null;
	}
	}
	
}
