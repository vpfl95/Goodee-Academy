package com.dh.kdh.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.kdh.board.impl.BoardDTO;
import com.dh.kdh.board.impl.BoardService;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardDTO> getList(Long page) throws Exception {
		System.out.println("service page:" + page);
		Long perPage = 10L; //한페이지에 출력할 목록의 개수
		//한페이지에 10개씩 출력 기준
		//page	startrow	lastrow
		//1		1			10
		//2		11			20
		//3		21			30
		Long startRow = 0L;
		Long lastRow = 0L;
		
		startRow = (page-1) * perPage +1;
		lastRow = page*perPage;
		
		System.out.println("startrow:"+startRow);
		System.out.println("lastrow:"+lastRow);
		
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("startRow", startRow);
		map.put("lastRow",lastRow);
		
		return noticeDAO.getList(map);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		return noticeDAO.setAdd(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return noticeDAO.setDelete(boardDTO);
	}

}
