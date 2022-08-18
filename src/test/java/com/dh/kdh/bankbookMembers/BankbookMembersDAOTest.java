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
			assertNotNull(arr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
