package com.javalec.ex.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javalec.ex.dto.BoardDto;

@Repository
public interface BoardDao {

	List<BoardDto> list(); //게시판 리스트 가져오기
	List<Map<String, Object>> list2();
	
}
