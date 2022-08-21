package com.dh.kdh.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void getList(Model model)throws Exception{
		List<BankBookDTO> arr = bankBookService.getList();
		model.addAttribute("list",arr);
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void setBankBook()throws Exception{
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String setBankBook(BankBookDTO bankBookDTO)throws Exception{
		int result = bankBookService.setBankBook(bankBookDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDetail(Model model, BankBookDTO bankBookDTO)throws Exception {
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("dto",bankBookDTO);
		return "bankbook/detail";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void setUpdate(BankBookDTO bankBookDTO, Model model)throws Exception{
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("dto",bankBookDTO);
	}
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String setUpdate(BankBookDTO bankBookDTO)throws Exception{
		int result = bankBookService.setUpdate(bankBookDTO);
		return "redirect:./detail?bookNum="+bankBookDTO.getBookNum();
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String setDelete(BankBookDTO bankBookDTO)throws Exception{
		int result = bankBookService.setDelete(bankBookDTO);
		return "redirect:./list";
	}
}
