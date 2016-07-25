package org.lyk.controller;

import java.util.List;

import javax.inject.Inject;
import javax.management.modelmbean.ModelMBeanInfoSupport;

import org.lyk.domain.BoardVO;
import org.lyk.persistence.BoardDAO;
import org.lyk.persistence.PageMaker;
import org.lyk.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@RequestMapping("/board/")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardDAO dao;
	
	@RequestMapping("/list")
	public String list(Integer page, Model model) throws Exception{
		
		
		
		if(page==null) page=1;
		logger.info("dddd"+page);
		List<BoardVO> list = dao.read(page);
		model.addAttribute("list", list);
		model.addAttribute("PageMaker", new PageMaker(page,dao.totalCount()));
		
		return "/board/list";
	}
	@RequestMapping("/register")
	public void create(){
		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String createpost(BoardVO vo) throws Exception{
		dao.create(vo);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/view")
	public void view(Integer bno, Model model) throws Exception{
		
		BoardVO vo = dao.view(bno);
		
		model.addAttribute("vo", vo);
		
	}
	@RequestMapping("/modify")
	public void update(Integer bno, Model model) throws Exception{
		model.addAttribute("vo",dao.view(bno));
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String updatepost(BoardVO vo) throws Exception{
		
		dao.update(vo);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/remove")
	public String delete(BoardVO vo) throws Exception{
		
		dao.delete(vo);
		return "redirect:/board/list";
	}
	
	}
	
	
	

