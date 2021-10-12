package com.ktds.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.mapper.MemberMapper;
import com.ktds.model.Member;

@RestController  // �������� Controller�� ���� ����
public class MemberController {

	private MemberMapper mapper;
	
	//Controller�� �����ڰ� ȣ��� �� mapper�� �ν��Ͻ��� ...?
	public MemberController(MemberMapper mapper) {
		this.mapper = mapper;
	}

	
	@GetMapping("/user/{member_id}") //Ŭ���̾�Ʈ�� ȣ���� /user/{id}(PathVariable�� �ν�, String���� �Ķ���͸� ����)
	public Member getMember(@PathVariable("member_id") String member_id) {
		return mapper.getMember(member_id);
	}
	
	@GetMapping("/user/all")
	public List<Member> getMemberList(){
		return mapper.getMemberList();
	}
	
	@PutMapping("/user/{member_id}") 
	// PathVariable�� id�� �ּҷ� �޾Ƽ�(localhost:8080/user/id)
	// RequestParam�� �Ķ���͸� �޾Ƽ� ��� ���(localhost:8080/user/1(id)?name=ȫ�浿?phone=111-1111?address) �̷� ����
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
	
	
	}
	//signup form�� post method�� �޾ƿͼ� 
	//MemberMapper�� insertMember�� �Ѿ��.
	@PostMapping("/user/member")
	public String postUserProfile(@RequestParam("member_id") String member_id,
			@RequestParam("member_pw") String member_pw, 
			@RequestParam("member_name") String member_name,
			@RequestParam("member_sex") String member_sex,
			@RequestParam("member_age") int member_age,
			@RequestParam("member_email") String member_email,
			@RequestParam("member_rank") int member_rank,
			@RequestParam("member_image") String member_image,
			@RequestParam("member_content") String member_content) {
		mapper.insertMember(member_id, member_pw, member_name, member_sex, member_age, member_email, member_rank, member_image, member_content);
	
		return "login";
	}
	
	/*@PostMapping("/user/login")
	public String postMemberLogin(@RequestParam("member_id") String member_id,
			@RequestParam("member_pew") String member_pw) {
		mapper.loginMember(member_id, member_pw);
	}*/
	
	@DeleteMapping("/user/{member_id}")
	public void deleteUserProfile(@PathVariable("member_id") String member_id) {
		mapper.deleteMember(member_id);
		
		
	}
	
	
}
