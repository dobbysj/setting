package com.javalec.ex.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.javalec.ex.dto.MemberDto;

@Repository
public interface MemberDao {

	//로그인
	int loginCheck(@Param("mdto") MemberDto mdto);
	int loginIdCheck(@Param("mdto") MemberDto mdto);
	
	//회원가입
	int idCheck(String mid);
	
}
