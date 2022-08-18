package com.dh.kdh.bankmember;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member/*")
public class BankMembersController {

	@Autowired
	private BankMembersService bankMembersService;
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void setJoin()throws Exception{
	}
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String setJoin(BankMembersDTO bankMembersDTO)throws Exception{
		int result = bankMembersService.setJoin(bankMembersDTO);
		return "redirect:./login";
	}
	
	@RequestMapping(value = "logout")
	public String getLogout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void getLogin()throws Exception{
	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String getLogin(HttpSession session, BankMembersDTO bankMembersDTO, Model model)throws Exception{
		bankMembersDTO = bankMembersService.getLogin(bankMembersDTO);
		session.setAttribute("member", bankMembersDTO);
		model.addAttribute("member",bankMembersDTO);
		return "redirect:../";
	}
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public void getSearchByID()throws Exception{

	}
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public ModelAndView getSearchByID(Model model, String search)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list", bankMembersService.getSearchByID(search));
		mv.setViewName("member/list");
		
		return mv;
	}
	
}
