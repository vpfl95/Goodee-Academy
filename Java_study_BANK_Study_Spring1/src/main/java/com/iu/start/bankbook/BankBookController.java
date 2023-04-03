package com.iu.start.bankbook;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.el.ELParseException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception {
		System.out.println("BankBook List 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		ArrayList<BankBookDTO> arr = bankBookDAO.getList();
		
		request.setAttribute("list", arr);
		
		return "/bankbook/list";
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(int booknum, HttpServletRequest request) throws Exception {
		System.out.println("BankBook Detail 실행");
		System.out.println(booknum);
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO book = new BankBookDTO();

		book.setBooknum(booknum);
		
		book = bankBookDAO.getDetail(book);
		request.setAttribute("dto", book);
		
		return "/bankbook/detail";		//jsp 리턴
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		System.out.println("GET add 실행");
		
		return "/bankbook/add";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(String bookname, double bookrate) throws Exception {
		System.out.println("POST add 실행");
		BankBookDTO book = new BankBookDTO();
		BankBookDAO bankBookDAO = new BankBookDAO();
		book.setBookname(bookname);
		book.setBookrate(bookrate);
		bankBookDAO.setBankBook(book);
		
		return "/bankbook/add";
	}
	
}
