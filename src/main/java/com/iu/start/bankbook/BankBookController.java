package com.iu.start.bankbook;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.el.ELParseException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
//	@RequestMapping(value = "add", method = RequestMethod.POST)
//	public String add(String bookname, double bookrate) throws Exception {
//		System.out.println("POST add 실행");
//		BankBookDTO book = new BankBookDTO();
//		BankBookDAO bankBookDAO = new BankBookDAO();
//		book.setBookname(bookname);
//		book.setBookrate(bookrate);
//		bankBookDAO.setBankBook(book);
//	
//		return "/bankbook/add";
//	}
	// /bankbook/add POST
	// name, rate
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(BankBookDTO book) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println(book.getBookname());
		System.out.println(book.getBookrate());
		BankBookDAO bankBookDAO = new BankBookDAO();
		int result = bankBookDAO.setBankBook(book);
		//상품등록 후 리스트페이지로 이동
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	
	// /bankbook/add GET /WEB-INF/views/bankbook/add/jsp
	@RequestMapping(value = "add" )
	public void add()throws Exception{
		System.out.println("add 실행");
		//return "bankbook/add";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		//ModelAndView mv = new ModelAndView();
		
		System.out.println("BankBook List 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		ArrayList<BankBookDTO> arr = bankBookDAO.getList();
//		ArrayList<BankBookDTO> arr = new ArrayList<BankBookDTO>();
//		BankBookDTO book = new BankBookDTO();
//		book.setBookname("asdfas");
//		book.setBooknum(1242);
//		book.setBookrate(1.1);
//		book.setBooksale(0);
//		arr.add(book);
		model.addAttribute("list", arr);
		//request.setAttribute("list", arr);
		return "/bankbook/list";
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("BankBook Detail 실행");

		BankBookDAO bankBookDAO = new BankBookDAO();
		
		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
		mv.addObject("dto", bankBookDTO);
		
		mv.setViewName("bankbook/detail");
		return mv;
		//return "/bankbook/detail";		//jsp 리턴
	}
	
	
	
	
}
