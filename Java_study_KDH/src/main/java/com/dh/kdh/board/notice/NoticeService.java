package com.dh.kdh.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.kdh.board.impl.BoardDTO;
import com.dh.kdh.board.impl.BoardService;
import com.dh.kdh.util.Pager;

@Service
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		pager.getRowNum();
		Long totalCount = noticeDAO.getCount();
		pager.getNum(totalCount);
		return noticeDAO.getList(pager);
//		//System.out.println("service page:" + page);
//		//Long perPage = 10L; //한페이지에 출력할 목록의 개수
//		//한페이지에 10개씩 출력 기준
//		//page	startrow	lastrow
//		//1		1			10
//		//2		11			20
//		//3		21			30
//		Long startRow = 0L;
//		Long lastRow = 0L;
//		
//		startRow = (page-1) * perPage +1;
//		lastRow = page*perPage;
//		
//		System.out.println("startrow:"+startRow);
//		System.out.println("lastrow:"+lastRow);
//		
//		Map<String, Long> map = new HashMap<String, Long>();
//		map.put("startRow", startRow);
//		map.put("lastRow",lastRow);
//		
//		/*JSP에 페이지번호를 출력 1-?
//		 * 1.글의 총갯수
//		 * 2.총 페이지수 구하기
//		 * */
//		Long totalCount = noticeDAO.getCount();
//		Long totalPage = totalCount % perPage==0 ? totalCount/perPage : totalCount/perPage+1;
//		//3. totalBlock 갯수 구하기
//		//Block : 
//		//perBlock: 한 페이지의 출력할 번호의 수
//		Long perBlock=5L;
//		Long totalBlock = totalPage % perBlock == 0 ? totalPage/perBlock : totalPage/perBlock+1;
//		/*4. page로 현재 Block 번호 찾기
//		 	page	curBlcok
//		 	1		1
//		 	2		1
//		 	3		1
//		 	4		1
//		 	5		1
//		 	6		2
//			perBlock: 한 페이지의 출력할 번호의 수*/
//		Long curBlock = page % perBlock== 0 ? page/perBlock : page/perBlock+1;
//		
//		/*5. curBlock으로 시작번호와 긑번호 알아 오기
//	 	curBlock	startNum	lastNum
//	 	1			1			5
//	 	2			6			10
//	 	3			11			16
//		*/
//		Long startNum = (curBlock-1)*perBlock + 1;
//		Long lastNum = curBlock*perBlock;
//		
//		return noticeDAO.getList(map);
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
