package com.dh.kdh.bankaccount;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dh.kdh.bankmember.BankMembersDTO;


@Controller
@RequestMapping(value = "/bankaccount/*")
public class BankAccountController {

	@Autowired
	private BankAccountService bankAccountService;
	
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(BankAccountDTO bankAccountDTO, HttpSession session)throws Exception {
		
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("member");
		
		bankAccountDTO.setUserName(bankMembersDTO.getUserName());
		int result =bankAccountService.add(bankAccountDTO);
		
		return "redirect:../bankbook/list";
	}
}
