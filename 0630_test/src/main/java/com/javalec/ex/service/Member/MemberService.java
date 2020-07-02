package com.javalec.ex.service.Member;

import com.javalec.ex.dto.MemberDto;

public interface MemberService {

	int loginCheck(MemberDto mdto);
	int loginIdCheck(MemberDto mdto);
	int loginPwCheck(MemberDto mdto);
}
