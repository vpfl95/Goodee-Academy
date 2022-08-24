package com.dh.kdh.board.impl;

import java.util.List;

import com.dh.kdh.util.Pager;

public interface BoardDAO {
	
	//db개수 가져오기
	public Long getCount()throws Exception;
	
	
	//글목록
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	//글상세보기
	public BoardDTO getDetail(BoardDTO boardDTO)throws Exception;
	
	//글쓰기
	public int setAdd(BoardDTO boardDTO)throws Exception;
	
	//글수정
	public int setUpdate(BoardDTO boardDTO)throws Exception;
	
	//글삭제
	public int setDelete(BoardDTO boardDTO)throws Exception;
}
