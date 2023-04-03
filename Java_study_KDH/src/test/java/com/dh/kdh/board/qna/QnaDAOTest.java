package com.dh.kdh.board.qna;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dh.kdh.MyAbstractTest;
import com.dh.kdh.board.impl.BoardDTO;

public class QnaDAOTest extends MyAbstractTest {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void getList()throws Exception {
		List<BoardDTO> arr = qnaDAO.getList();
		assertEquals(0, arr.size());
	}
	
	@Test
	public void getDetail()throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setNum((long)0);
		boardDTO = qnaDAO.getDetail(boardDTO);
		assertNull(boardDTO);
	}
	
//	@Test
//	public void setAdd()throws Exception {
//		BoardDTO boardDTO = new BoardDTO();
//		
//		boardDTO.setTitle("asdf");
//		boardDTO.setContents("asdfasdf");
//		boardDTO.setWriter("qwer");
//		int result = qnaDAO.setAdd(boardDTO);
//		assertEquals(1, result);
//	}
	
//	@Test
//	public void setUpdate()throws Exception {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setNum((long)122);
//		boardDTO.setTitle("zzzz");
//		boardDTO.setContents("zzzzz");
//		int result = qnaDAO.setUpdate(boardDTO);
//		assertEquals(1, result);
//	}
	
	@Test
	public void setDelete()throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setNum((long)122);
		int result = qnaDAO.setDelete(boardDTO);
		assertEquals(1, result);
	}

}
