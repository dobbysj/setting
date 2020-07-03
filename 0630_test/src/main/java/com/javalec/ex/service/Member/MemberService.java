package com.javalec.ex.service.Member;

import com.javalec.ex.dto.MemberDto;

public interface MemberService {

	//로그인
	int loginCheck(MemberDto mdto);
	int loginIdCheck(MemberDto mdto);
	
	//회원가입
	int idCheck(String mid);
}
