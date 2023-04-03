package com.dh.kdh.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dh.kdh.board.impl.BoardDTO;

@Controller
@RequestMapping(value = "/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value = "list")
	public ModelAndView getList()throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> arr = qnaService.getList();
		mv.addObject("list",arr);
		mv.addObject("board","Qna");
		mv.setViewName("board/list");
		return mv;
	}
	
	@RequestMapping(value = "detail")
	public ModelAndView getDetail(BoardDTO boardDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		boardDTO = qnaService.getDetail(boardDTO);
		mv.addObject("boardDTO",boardDTO);
		mv.addObject("board","Qna");
		mv.setViewName("board/detail");
		return mv;
	}
	
	@RequestMapping(value = "add")
	public String setAdd()throws Exception{
		return "board/add";
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String setAdd(BoardDTO boardDTO)throws Exception{
		int result = qnaService.setAdd(boardDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value = "update")
	public String setUpdate(BoardDTO boardDTO, Model model)throws Exception{
		boardDTO = qnaService.getDetail(boardDTO);
		model.addAttribute("boardDTO",boardDTO);
		return "board/update";
	}
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String setUpdate(BoardDTO boardDTO)throws Exception{
		int result = qnaService.setUpdate(boardDTO);
		return "redirect:./detail?num="+boardDTO.getNum();
	}
	
	@RequestMapping(value = "delete")
	public String setDelete(BoardDTO boardDTO)throws Exception{
		int result = qnaService.setDelete(boardDTO);
		return "redirect:./list";
	}
	
}
