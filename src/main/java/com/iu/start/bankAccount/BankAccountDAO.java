package com.iu.start.bankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.iu.start.util.DBConnector;

@Repository
public class BankAccountDAO implements AccountDAO {

	@Override
	public int add(AccountDTO accountDTO) throws Exception {
		Connection con = DBConnector.getConnection();
		
		String sql = "INSERT INTO BANKACCOUNT VALUES(ACCOUNT_SEQ.NEXTVAL,?,?,sysdate)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, accountDTO.getUserName());
		st.setLong(2, accountDTO.getBookNum());
		
		int result = st.executeUpdate();
		
		DBConnector.disConnect(st, con);
		
		return result;
	}

}
