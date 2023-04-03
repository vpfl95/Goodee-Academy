package com.dh.kdh.bankaccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.kdh.bankmember.BankMembersDTO;

@Service
public class BankAccountService {
	
	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	public int add(BankAccountDTO bankAccountDTO) throws Exception{
		return bankAccountDAO.add(bankAccountDTO);
	}
	
	public List<BankAccountDTO> getListByUserName(BankMembersDTO bankMembersDTO)throws Exception{
		return bankAccountDAO.getListByUserName(bankMembersDTO);
	}
}
