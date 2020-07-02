package com.javalec.ex.service.Board;

import java.util.List;
import java.util.Map;

import com.javalec.ex.dto.BoardDto;

public interface BoardService {

	List<BoardDto> list(); //게시판 리스트 가져오기
	List<Map<String, Object>> list2();
	
}
