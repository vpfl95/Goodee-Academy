package com.dh.kdh.bankbookMembers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dh.kdh.MyAbstractTest;
import com.dh.kdh.bankmember.BankMembersDAO;
import com.dh.kdh.bankmember.BankMembersDTO;

public class BankbookMembersDAOTest extends MyAbstractTest {
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	@Test
	public void getSearchByID() {
		try {
			List<BankMembersDTO> arr =  bankMembersDAO.getSearchByID("id");
			assertEquals(0, arr.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void getMyPage()throws Exception{
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		bankMembersDTO.setName("id5");
		bankMembersDTO = bankMembersDAO.getMyPage(bankMembersDTO);
		System.out.println(bankMembersDTO.getEmail());
		assertNotNull(bankMembersDTO);
	}
	
	@Test
	public void getLogin() {
//		BankMembersDTO member = bankMembersDAO.getLogin();
	}
	
}
