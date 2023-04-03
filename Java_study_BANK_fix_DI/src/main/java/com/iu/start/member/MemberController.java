package com.iu.start.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //이 클래스는 controller역할, Container에게 이 클래스의 객체를 생성 위임
@RequestMapping(value = "/member/*")
public class MemberController {
	
	@Autowired
	private BankMembersService bankMembersService;
	
	// annotation
	// @ : 설명+실행
	
	@RequestMapping(value = "logout.iu", method = RequestMethod.GET)
	public String logout(HttpSession session)throws Exception {
		session.invalidate();
		return "redirect:../";
	}
	
	// /member/login
	@RequestMapping(value = "login.iu", method = RequestMethod.GET)
	public String login() {
		System.out.println("로그인 실행");
		return "member/login";
	}
	@RequestMapping(value = "login.iu", method = RequestMethod.POST)
	public String login(HttpSession session, BankMembersDTO bankMembersDTO, Model model)throws Exception {
		System.out.println("DB에로그인 실행");
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		bankMembersDTO = bankMembersService.getLogin(bankMembersDTO);
		System.out.println(bankMembersDTO);
		//HttpSession session = request.getSession();
		session.setAttribute("member", bankMembersDTO);
		model.addAttribute("member",bankMembersDTO);
		//"redirect:다시접속할URL주소(절대경로,상대경로)"
		return "redirect:../";
	}
	
	// /member/join  value에 들어가는 경로는 무조건 절대경로
	@RequestMapping(value = "join.iu", method = RequestMethod.GET)
	public String join() {
		System.out.println("Join GET 실행");
		return "member/join";
	}
	
	//POST
	@RequestMapping(value = "join.iu", method = RequestMethod.POST)
	public String join(BankMembersDTO member) throws Exception {
		System.out.println("Join POST 실행");
		
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
//		BankMembersDTO member = new BankMembersDTO();  //매개변수로 BankMembersDTO를 받아서 사용할수 있어서 생략가능
//		member.setId(id);
//		member.setPw(pw);
//		member.setName(name);
//		member.setEmail(email);
//		member.setPhone(phone);
		int result = bankMembersService.setJoin(member);
		if(result==1) 
			System.out.println("가입 성공");
		else 
			System.out.println("가입 실패");
		//로그인폼 페이지로 이동
		//redirect
		return "redirect:./login.iu";
	}
	
	@RequestMapping(value = "search.iu", method = RequestMethod.GET)
	public void getSearchByID() throws Exception{
		System.out.println("search 실행 GET");
	}
	@RequestMapping(value = "search.iu", method = RequestMethod.POST)
	public String getSearchByID(String search, Model model) throws Exception{
		System.out.println("search 실행 POST");
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		List<BankMembersDTO> arr = bankMembersService.getSearchByID(search);

		model.addAttribute("list", arr);
		return "member/list";
	}
	
}
