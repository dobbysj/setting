package com.javalec.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javalec.ex.dto.MemberDto;
import com.javalec.ex.service.Board.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService bServ;
	
	@RequestMapping("nboard")
	public String nboard (Model model) {
		model.addAttribute("list",bServ.list2());
		return "board/nboard";
	}
	
	
	
}
