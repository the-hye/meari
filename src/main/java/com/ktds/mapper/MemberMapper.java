package com.ktds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ktds.model.Member;

//DB와 연결하는 인터페이스
@Mapper
public interface MemberMapper {
	
	//@Param("id")에 있는 id를 파라미터로 받아서 SELECT 문의 ID와 연결된다 	
	@Select("SELECT * FROM MEMBER WHERE member_id=#{member_id}")
	Member getMember(@Param("member_id") String member_id);
	
	@Select("SELECT * FROM MEMBER")
	List<Member> getMemberList();
	
	
	//회원 가입 
	//MemberController의 Post Method로 받아온다
	@Insert("INSERT INTO MEMBER VALUES(#{member_id}, #{member_pw}, #{member_name}, #{member_sex}, #{member_age}, #{member_email}, #{member_rank}, #{member_image}, #{member_content})")
	int insertMember(@Param("member_id") String member_id,
		@Param("member_pw") String member_pw, 
		@Param("member_name") String member_name, 
		@Param("member_sex") String member_sex,
		@Param("member_age") int member_age,
		@Param("member_email") String member_email,
		@Param("member_rank") int member_rank,
		@Param("member_image") String member_image,
		@Param("member_content") String member_content);
	
	
	/*
	@Select("SELECT #{member_id}, #{member_pw} FROM MEMBER WHERE member_id=#{member_id}")
	int loginMember(@Param("member_id") String member_id,
			@Param("member_pw") String member_pw);
	*/
	
	@Update("UPDATE MEMBER SET member_pw=#{member_pw}, member_name=#{member_name}, member_sex=#{member_sex}, member_age=#{member_age}, member_email=#{member_email}, member_image=#{member_image}, member_rank=#{member_rank}, member_content=#{member_content} where member_id=#{member_id}")
	int updateMember(@Param("member_id") String member_id,
			@Param("member_pw") String member_pw, 
			@Param("member_name") String member_name, 
			@Param("member_sex") String member_sex,
			@Param("member_age") int member_age,
			@Param("member_email") String member_email,
			@Param("member_rank") int member_rank,
			@Param("member_image") String member_image,
			@Param("member_content") String member_content);
	
	
	@Delete("DELETE FROM MEMBER WHERE member_id=#{member_id}")
	int deleteMember(@Param("member_id") String member_id);
		
}	
	


