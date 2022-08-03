package com.iu.start.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.iu.start.util.DBConnector;

public class BankMembersDAO implements MembersDAO {
	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		Connection con = DBConnector.getConnection();
		
		String sql = "INSERT INTO BankMembers VALUES(?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1,bankMembersDTO.getId());
		st.setString(2,bankMembersDTO.getPw());
		st.setString(3,bankMembersDTO.getName());
		st.setString(4,bankMembersDTO.getEmail());
		st.setString(5,bankMembersDTO.getPhone());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}
	
	//입력해서 ID 찾기
	@Override
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception {
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM BankMembers WHERE ID LIKE ? ORDER BY DESC";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+search+"%");
		ResultSet rs = st.executeQuery();
		ArrayList<BankMembersDTO> members = new ArrayList<BankMembersDTO>();
		while(rs.next()) {
			BankMembersDTO member = new BankMembersDTO();
			member.setId(rs.getString("ID"));
			member.setPw(rs.getString("PW"));
			member.setName(rs.getString("NAME"));
			member.setEmail(rs.getString("EMAIL"));
			member.setPhone(rs.getString("PHONE"));
			members.add(member);
		}
		DBConnector.disConnect(st, con, rs);
		return members;
	}

}
