package com.javalec.ex.dao;

import org.springframework.stereotype.Repository;

import com.javalec.ex.dto.MemberDto;

@Repository
public interface MemberDao {

	int loginCheck(MemberDto mdto);
	int loginIdCheck(MemberDto mdto);
	int loginPwCheck(MemberDto mdto);
	
}
