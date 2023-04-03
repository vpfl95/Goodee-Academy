package com.iu.start.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.start.util.DBConnector;

@Repository
public class BankMembersDAO implements MembersDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.start.member.BankMembersDAO."; 
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
//		Connection con = DBConnector.getConnection();
//		
//		String sql = "SELECT ID, NAME FROM BANKMEMBERS WHERE ID=? AND PW=?";
//		
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		st.setString(1, bankMembersDTO.getId());
//		st.setString(2, bankMembersDTO.getPw());
//		
//		ResultSet rs = st.executeQuery();
//		if(rs.next()) {
//			bankMembersDTO = new BankMembersDTO();
//			bankMembersDTO.setId(rs.getString("ID"));
//			bankMembersDTO.setName(rs.getString("NAME"));
//		}else {
//			bankMembersDTO = null;
//		}
//		DBConnector.disConnect(st, con);
		
		return sqlSession.selectOne(NAMESPACE + "getLogin", bankMembersDTO);
	}
	
	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
//		Connection con = DBConnector.getConnection();
//		
//		String sql = "INSERT INTO BankMembers VALUES(?,?,?,?,?)";
//		
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		st.setString(1,bankMembersDTO.getId());
//		st.setString(2,bankMembersDTO.getPw());
//		st.setString(3,bankMembersDTO.getName());
//		st.setString(4,bankMembersDTO.getEmail());
//		st.setString(5,bankMembersDTO.getPhone());
//		
//		int result = st.executeUpdate();
//		
//		DBConnector.disConnect(st, con);
//		
//		return result;
		return sqlSession.insert(NAMESPACE+"setJoin", bankMembersDTO);
	}
	
	//입력해서 ID 찾기
	@Override
	public List<BankMembersDTO> getSearchByID(String search) throws Exception {
//		Connection con = DBConnector.getConnection();
//		String sql = "SELECT * FROM BankMembers WHERE ID LIKE ? ORDER BY ID DESC";
//		PreparedStatement st = con.prepareStatement(sql);
//		st.setString(1, "%"+search+"%");
//		ResultSet rs = st.executeQuery();
//		ArrayList<BankMembersDTO> members = new ArrayList<BankMembersDTO>();
//		while(rs.next()) {
//			BankMembersDTO member = new BankMembersDTO();
//			member.setId(rs.getString("ID"));
//			member.setPw(rs.getString("PW"));
//			member.setName(rs.getString("NAME"));
//			member.setEmail(rs.getString("EMAIL"));
//			member.setPhone(rs.getString("PHONE"));
//			members.add(member);
//		}
//		DBConnector.disConnect(st, con, rs);
//		return members;
		return sqlSession.selectList(NAMESPACE + "getSearchByID", search);
	}

}
