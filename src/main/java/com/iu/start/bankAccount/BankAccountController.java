package com.iu.start.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.start.member.BankMembersDTO;

@Controller
@RequestMapping(value = "/bankAccount/*")
public class BankAccountController {
	
	private BankAccountDAO bankAccountDAO;
	
	public BankAccountController() {
		this.bankAccountDAO = new BankAccountDAO();
	}
	
	@RequestMapping(value = "add.iu", method = RequestMethod.GET)
	public String add(AccountDTO accountDTO, HttpSession session)throws Exception {
		System.out.println("BankAccount add 실행");
		System.out.println(accountDTO.getBookNum());
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		System.out.println(bankMembersDTO.getId());
		accountDTO.setUserName(bankMembersDTO.getId());
		int result =bankAccountDAO.add(accountDTO);
		
		return "redirect:../bankbook.list.iu";
	}
	
}
