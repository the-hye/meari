package com.ktds.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ktds.model.Member;

@Mapper
public interface MemberMapper {

	@Select("SELECT * FROM MEMBER WHERE member_id=#{member_id}")
	Member getMember(@Param("member_id") String member_id);
	
	@Select("SELECT * FROM MEMBER")
	List<Member> getMemberList();
	

	@Insert("INSERT INTO MEMBER VALUES(#{member_id}, #{member_email}, #{member_pw}, #{member_pw_corr}, #{member_name}, #{member_age})")
	int insertMember(@Param("member_id") String member_id,
		@Param("member_email") String member_email,
		@Param("member_pw") String member_pw,
		@Param("member_pwd_corr") String member_pw_corr,
		@Param("member_name") String member_name,
		@Param("member_age") Date member_age);

	/* Not Used
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
	*/
	
	@Delete("DELETE FROM MEMBER WHERE member_id=#{member_id}")
	int deleteMember(@Param("member_id") String member_id);
		
}	
	


