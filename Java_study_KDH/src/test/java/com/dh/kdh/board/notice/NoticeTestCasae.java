package com.dh.kdh.board.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dh.kdh.MyAbstractTest;
import com.dh.kdh.board.impl.BoardDTO;

public class NoticeTestCasae extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
//	@Test
//	public void getList()throws Exception {
//		
//		List<BoardDTO> arr = noticeDAO.getList();
//		assertNotEquals(0,arr.size());
//	
//	}
	
	@Test
	public void getCount()throws Exception {
		Long result = noticeDAO.getCount();
		
		System.out.println(result);
		
	}
	
//	@Test
//	public void getDetail() {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setNum((long) 3);
//		try {
//			boardDTO = noticeDAO.getDetail(boardDTO);
//			assertNotNull(boardDTO);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void setAdd()throws Exception {
//		for(int i=0; i<100; i++) {
//			NoticeDTO noticeDTO = new NoticeDTO();
//			noticeDTO.setTitle("Title"+i);
//			noticeDTO.setContents("Contents"+i);
//			noticeDTO.setWriter("Writer"+i);
//			
//			int result = noticeDAO.setAdd(noticeDTO);
//			if(i%10==0) {
//				Thread.sleep(500);
//			}
//		}
//		System.out.println("Finish~~~~~~~~");
//	}
//	
//	@Test
//	public void setUpdate() {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setNum((long)1);
//		boardDTO.setTitle("asdfasd");
//		try {			
//			int result = noticeDAO.setUpdate(boardDTO);
//			assertNotEquals(0,result);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void setDelete() {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setNum((long)1);
//		boardDTO.setTitle("asdfasd");
//		try {			
//			int result = noticeDAO.setDelete(boardDTO);
//			assertNotEquals(0,result);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
