package com.javalec.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.ex.dao.BoardDao;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDao bdao;
	
	
}
