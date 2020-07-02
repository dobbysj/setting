package com.javalec.ex.service.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.ex.dao.MemberDao;
import com.javalec.ex.dto.MemberDto;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	MemberDao mdao;
	
	@Override
	public int loginCheck(MemberDto mdto) {
		return mdao.loginCheck(mdto);
	}
	
	@Override
	public int loginIdCheck(MemberDto mdto) {
		return mdao.loginIdCheck(mdto);
	}

	@Override
	public int loginPwCheck(MemberDto mdto) {
		return mdao.loginPwCheck(mdto);
	}

	
	
}
