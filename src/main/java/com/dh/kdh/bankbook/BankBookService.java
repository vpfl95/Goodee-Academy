package com.dh.kdh.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> getList() throws Exception{
		return bankBookDAO.getList();
	}
	
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setBankBook(bankBookDTO);
	}
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.getDetail(bankBookDTO);
	} 
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setDelete(bankBookDTO);
	}
	
}
