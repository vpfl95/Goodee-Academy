package com.iu.start.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.iu.start.util.DBConnector;

public class BankBookDAO implements BookDAO{
	//BankBook 테이블에 insert
		//BookNum: 현재 시간을 밀리세컨즈로 변환해서 입력
		//BookSale: 1로 입력
	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		Calendar ca = Calendar.getInstance();
		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO BankBook VALUES(?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, (int)ca.getTimeInMillis());
		st.setString(2, bankBookDTO.getBookname());
		st.setDouble(3, bankBookDTO.getBookrate());
		st.setInt(4, 1);
		int result = st.executeUpdate();
		DBConnector.disConnect(st, con);
		return result;
	}
	//모든 데이터를 조회 최신순으로
	@Override
	public ArrayList<BankBookDTO> getList() throws Exception {
		Connection con =DBConnector.getConnection();
		String sql = "SELECT * FROM BankBook ORDER BY BOOKNUM";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		ArrayList<BankBookDTO> books = new ArrayList<BankBookDTO>();
		while(rs.next()) {
			BankBookDTO book = new BankBookDTO();
			book.setBooknum(rs.getInt("BOOKNUM"));
			book.setBookname(rs.getString("BOOKNAME"));
			book.setBookrate(rs.getDouble("BOOKRATE"));
			book.setBooksale(rs.getInt("BOOKSALE"));
			books.add(book);
		}
		return books;
	}
	//어느 하나의 row의 Sale컬럼 수정
	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		Connection con =DBConnector.getConnection();
		String sql = "UPDATE BankBook SET BOOKSALE = ? WHERE BOOKNUM = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, 0);
		st.setInt(2, bankBookDTO.getBooknum());
		int result = st.executeUpdate();
		return result;
	}
	
	//BookNum의 값으로 조회
	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection con = DBConnector.getConnection();
		String sql ="SELECT * FROM BankBook WHERE BOOKNUM = ?";
		PreparedStatement st = con.prepareStatement(sql);
		if(bankBookDTO.getBooknum() == sc.nextInt())
			st.setInt(1, bankBookDTO.getBooknum());
		ResultSet rs = st.executeQuery();
		BankBookDTO book = null;
		if(rs.next()) {
			book = new BankBookDTO();
			book.setBooknum(rs.getInt("BOOKNUM"));
			book.setBookname(rs.getString("BOOKNAME"));
			book.setBookrate(rs.getDouble("BOOKRATE"));
			book.setBooksale(rs.getInt("BOOKSALE"));	
		}
		DBConnector.disConnect(st, con);
		return book;
	}
	
}
