package com.dh.kdh.bankmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/*")
public class BankMembersController {

	@Autowired
	private BankMembersService bankMembersService;
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public void getSearchByID()throws Exception{

	}
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String getSearchByID(Model model, String search)throws Exception{
		List<BankMembersDTO> arr = bankMembersService.getSearchByID(search);
		model.addAttribute("list", arr);
		return "./member/list";
	}
	
}
