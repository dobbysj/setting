package com.javalec.ex.service.Board;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.ex.dao.BoardDao;
import com.javalec.ex.dto.BoardDto;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDao bdao;

	@Override
	public List<BoardDto> list() {
		return bdao.list();
	}

	@Override
	public List<Map<String, Object>> list2() {
		return bdao.list2();
	}
	
	
}
