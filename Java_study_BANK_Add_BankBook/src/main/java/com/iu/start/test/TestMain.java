package com.iu.start.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.start.bankbook.BankBookDTO;
import com.iu.start.member.BankMembersDAO;
import com.iu.start.member.BankMembersDTO;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		BankMembersDTO member = new BankMembersDTO();
//		member.setId("id2");
//		member.setPw("pw2");
//		member.setName("name2");
//		member.setEmail("e2");
//		member.setPhone("010222");
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		try {
//			int result = bankMembersDAO.setJoin(member);
//			if(result==1) {
//				System.out.println("DB입력 완료");
//			}else {
//				System.out.println("DB입력 실패");
//			}
			ArrayList<BankMembersDTO> members = new ArrayList<BankMembersDTO>();
			System.out.println("검색할 ID입력");
			String search = sc.next(); 
			members = bankMembersDAO.getSearchByID(search);
			for(BankMembersDTO member: members) {
				System.out.println("ID: "+ member.getId()
								+" PW:" + member.getPw()
								+" NAME:" + member.getName()
								+" EMAIL:" + member.getEmail()
								+" PHONE:" + member.getPhone());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
