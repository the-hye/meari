package com.ktds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ktds.model.Member;

//DB�� �����ϴ� �������̽�
@Mapper
public interface MemberMapper {
	
	//@Param("id")�� �ִ� id�� �Ķ���ͷ� �޾Ƽ� SELECT ���� ID�� ����ȴ� 	
	@Select("SELECT * FROM MEMBER WHERE member_id=#{member_id}")
	Member getMember(@Param("member_id") String member_id);
	
	@Select("SELECT * FROM MEMBER")
	List<Member> getMemberList();
	
	
	//ȸ�� ���� 
	//MemberController�� Post Method�� �޾ƿ´�
	@Insert("INSERT INTO MEMBER VALUES(#{member_id}, #{member_pw}, #{member_pw_corr}, #{member_name}, #{member_email})")
	int insertMember(@Param("member_id") String member_id,
		@Param("member_pw") String member_pw,
		@Param("member_pw_corr") String member_pw_corr,
		@Param("member_name") String member_name,
		@Param("member_email") String member_email);
	
	
	/*
	@Select("SELECT #{member_id}, #{member_pw} FROM MEMBER WHERE member_id=#{member_id}")
	int loginMember(@Param("member_id") String member_id,
			@Param("member_pw") String member_pw);
	*/
	
	@Update("UPDATE MEMBER SET member_pw=#{member_pw}, member_pw_corr=#{member_pw_corr}, member_name=#{member_name}, member_email=#{member_email} where member_id=#{member_id}")
	int updateMember(@Param("member_id") String member_id,
			@Param("member_pw") String member_pw,
			@Param("member_pw_corr") String member_pw_corr,
			@Param("member_name") String member_name,
			@Param("member_email") String member_email);
	
	
	@Delete("DELETE FROM MEMBER WHERE member_id=#{member_id}")
	int deleteMember(@Param("member_id") String member_id);
		
}	
	


