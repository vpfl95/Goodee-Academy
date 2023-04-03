package com.iu.start.test;

import java.util.ArrayList;

import com.iu.start.bankbook.BankBookDAO;
import com.iu.start.bankbook.BankBookDTO;

public class TestBookMain {

	public static void main(String[] args) {
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankbook = new BankBookDTO();
		ArrayList<BankBookDTO> bankBooks = new ArrayList<BankBookDTO>();
		bankbook.setBooknum(111);
		bankbook.setBookname("book3");
		bankbook.setBookrate(1.5);
		bankbook.setBooksale(0);
		try {
//			bankBookDAO.setBankBook(bankbook);
			
//			bankBooks = bankBookDAO.getList();
//			for(BankBookDTO b:bankBooks) {
//				System.out.println("BOOKNUM: "+b.getBooknum()
//								+" BOOKNAME: "+b.getBookname()
//								+" BOOKRATE: "+b.getBookrate()
//								+" BOOKSALE: "+b.getBooksale());
//			}
//			
			int result = bankBookDAO.setChangeSale(bankbook);
			if(result==1) System.out.println("sale변경");
			else System.out.println("sale변경 실패");
			
//			BankBookDTO bankbook2 = bankBookDAO.getDetail(bankbook);
//			System.out.println("BOOKNUM: "+bankbook2.getBooknum()
//							+" BOOKNAME: "+bankbook2.getBookname()
//							+" BOOKRATE: "+bankbook2.getBookrate()
//							+" BOOKSALE: "+bankbook2.getBooksale());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
