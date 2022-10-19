package com.iu.home.board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.iu.home.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private QnaService qnaService;
	
	@GetMapping("list")
	public ModelAndView getList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		pager.setRowNum();
		List<QnaVO> arr = qnaService.getList(pager);
		
		mv.addObject("arr",arr);
		mv.setViewName("/board/qna");
		return mv;
	}
	
	@GetMapping("write")
	public ModelAndView setWrite()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/write");
		return mv;
	}
	
	@PostMapping("write")
	public String setWrite(QnaVO qnaVO, RedirectAttributes redirectAttributes)throws Exception{
		
		int result = qnaService.setAdd(qnaVO);
		redirectAttributes.addAttribute("result",result);
		
		return "redirect:./list";
	}
	
	@GetMapping("detail")
	public ModelAndView getDetail(QnaVO qnaVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		qnaVO = qnaService.getDetail(qnaVO);
		
		mv.addObject("qnaVO",qnaVO);
		mv.setViewName("/board/detail");
		
		return mv;
	}
	
}
