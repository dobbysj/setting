package com.javalec.ex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javalec.ex.dto.MemberDto;
import com.javalec.ex.service.Member.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService mServ;
	
	//로그인 페이지로 이동
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	
	//로그인 하기
	@RequestMapping("loginCheck")
	@ResponseBody
	public int loginCheck(MemberDto memberDto, HttpSession session) {
		System.out.println("들어왔니");
		System.out.println(memberDto.getMid());
		int val=0;
		if(mServ.loginCheck(memberDto)==1) {
			val = 1;
			session.setAttribute("userID", memberDto.getMid());
		} else {
			System.out.println("여기는들어왔니");
			if(mServ.loginIdCheck(memberDto)==1) {
				System.out.println("여기는들어왔니2");
				val = -1;
			} else {
				val = 0;
			}
		}
		return val;
	}
	
	//회원가입 페이지로
	@RequestMapping("join")
	public String join() {
		return "member/join";
	}
	
	//아이디 중복체크
	@RequestMapping("idCheck")
	@ResponseBody
	public int idCheck(@RequestBody String mid) {
		int val = 0;
		System.out.println(mid);
		if(mServ.idCheck(mid)>0) {
			val = 1; //중복되는 아이디 있음
		} else {
			val = 0; //중복되는 아이디 없음
		}
		return val;
	}
	
	
	
}
