package com.dh.kdh.board.notice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dh.kdh.board.impl.BoardDAO;
import com.dh.kdh.board.impl.BoardDTO;

@Repository
public class NoticeDAO implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESAPCE = "com.dh.kdh.board.notice.NoticeDAO.";
	
	@Override
	public Long getCount() throws Exception {
		return sqlSession.selectOne(NAMESAPCE+"getCount");
	}
	
	@Override
	public List<BoardDTO> getList(Map<String, Long> map) throws Exception {
		return sqlSession.selectList(NAMESAPCE+"getList",map);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESAPCE+"getDetail", boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(NAMESAPCE+"setAdd", boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return sqlSession.update(NAMESAPCE+"setUpdate", boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return sqlSession.delete(NAMESAPCE+"setDelete", boardDTO);
	}
	
}
