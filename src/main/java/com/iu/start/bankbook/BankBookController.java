package com.iu.start.bankbook;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
	@RequestMapping(value = "add.iu", method = RequestMethod.POST)
	public ModelAndView add(BankBookDTO book) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println(book.getBookName());
		System.out.println(book.getBookRate());
		BankBookDAO bankBookDAO = new BankBookDAO();
		int result = bankBookDAO.setBankBook(book);
		//상품등록 후 리스트페이지로 이동
		mv.setViewName("redirect:./list.iu");
		return mv;
	}
	
	
	// /bankbook/add GET /WEB-INF/views/bankbook/add/jsp
	@RequestMapping(value = "add.iu" )
	public void add()throws Exception{
		System.out.println("add 실행");
		//return "bankbook/add";
	}
	
	@RequestMapping(value = "list.iu", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		//ModelAndView mv = new ModelAndView();
		
		System.out.println("BankBook List 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		ArrayList<BankBookDTO> arr = bankBookDAO.getList();

		model.addAttribute("list", arr);
		//request.setAttribute("list", arr);
		return "/bankbook/list";
	}
	
	@RequestMapping(value = "detail.iu", method = RequestMethod.GET)
	public ModelAndView detail(HttpSession session, BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("BankBook Detail 실행");

		BankBookDAO bankBookDAO = new BankBookDAO();
		
		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
		mv.addObject("dto", bankBookDTO);
		
		mv.setViewName("bankbook/detail");
		return mv;
		//return "/bankbook/detail";		//jsp 리턴
	}
	
	@RequestMapping(value = "update.iu", method = RequestMethod.POST)
	public String update(BankBookDTO bankBookDTO) throws Exception{
		System.out.println("bankbook POST 업데이트 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		int result = bankBookDAO.setUpdate(bankBookDTO);
		System.out.println(bankBookDTO.getBookSale());
		if(result==1) System.out.println("업데이트 성공");
		else System.out.println("업데이트 실패");
		return "redirect:./detail.iu?bookNum="+bankBookDTO.getBookNum();
	}
	@RequestMapping(value = "update.iu", method = RequestMethod.GET)
	public void update(BankBookDTO bankBookDTO, Model model) throws Exception{
		System.out.println("bankbook GET 업데이트 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		System.out.println(bankBookDTO.getBookNum());
		bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
	}
	
	@RequestMapping(value = "delete.iu", method = RequestMethod.GET)
	public ModelAndView delete(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("bankbook delete 실행");
		BankBookDAO bankBookDAO = new BankBookDAO();
		int result = bankBookDAO.setDelete(bankBookDTO);
		mv.setViewName("redirect:./list.iu");
		return mv;
	}
	
	
}
