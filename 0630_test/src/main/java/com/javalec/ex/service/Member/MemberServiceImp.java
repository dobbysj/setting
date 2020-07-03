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
		System.out.println("왜 안될까? - 서비스 임프");
		mdao.loginCheck(mdto);
		System.out.println("여긴 왔을까 서비스임프");
		return mdao.loginCheck(mdto);
	}
	
	@Override
	public int loginIdCheck(MemberDto mdto) {
		return mdao.loginIdCheck(mdto);
	}

	@Override
	public int idCheck(String mid) {
		System.out.println("mid service imp" + mid);
		return mdao.idCheck(mid);
	}


	
	
}
