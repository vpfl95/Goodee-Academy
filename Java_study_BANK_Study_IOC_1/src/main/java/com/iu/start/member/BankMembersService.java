package com.iu.start.member;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMembersService {
	//BankMembersDAO에 의존적이다
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	//로그인
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO)throws Exception{
		return bankMembersDAO.getLogin(bankMembersDTO);
	}
	
	//bankMembers 회원가입
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.setJoin(bankMembersDTO);
	}
	
	//검색어를 입력해서 ID를 찾기
	public ArrayList<BankMembersDTO> getSearchByID(String search) throws Exception{
		return bankMembersDAO.getSearchByID(search);
	}
}
