package com.javalec.ex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javalec.ex.dto.MemberDto;
import com.javalec.ex.service.Member.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService mServ;
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("loginCheck")
	@ResponseBody
	public String loginCheck(MemberDto memberDto, HttpSession session) {
		int val=0;
		if(mServ.loginCheck(memberDto)==1) {
			session.setAttribute("userID", memberDto.getMid());
		} else {
			
		}
		
//		if(mServ.loginIdCheck(memberDto) == 1) {
//			if(mServ.loginPwCheck(memberDto))
//			
//			val = 1;
//		}
		
		
		return "";
	}
	
	
	
}
