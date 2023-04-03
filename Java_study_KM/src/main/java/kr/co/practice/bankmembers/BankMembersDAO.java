package kr.co.practice.bankmembers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankMembersDAO implements MembersDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "kr.co.practice.bankmembers.BankMembersDAO.";
	
	@Override
	public int setJoin(BankMembersDTO bankMembersDto) throws Exception {
		
		return sqlSession.insert(NAMESPACE + "setJoin", bankMembersDto);
	}
	@Override
	public List<BankMembersDTO> getSearchById(String search) throws Exception {
		
		return sqlSession.selectList(NAMESPACE + "getSearchById", search);
	}
	@Override
	public BankMembersDTO login(BankMembersDTO bankMembersDto) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE + "login", bankMembersDto);
	}
	
	
	
}
