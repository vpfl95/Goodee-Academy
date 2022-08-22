package com.dh.kdh.bankAccount;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dh.kdh.MyAbstractTest;
import com.dh.kdh.bankaccount.BankAccountDAO;
import com.dh.kdh.bankaccount.BankAccountDTO;
import com.dh.kdh.bankmember.BankMembersDTO;

public class BankAccountDAOTest extends MyAbstractTest {

	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	@Test
	public void getListTest()throws Exception {
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		bankMembersDTO.setUserName("id5");
 		
		List<BankAccountDTO> ar = bankAccountDAO.getListByUserName(bankMembersDTO);
		
		assertNotEquals(0, ar.size());
	}

}
