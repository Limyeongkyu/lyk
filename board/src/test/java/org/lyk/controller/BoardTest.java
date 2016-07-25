package org.lyk.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lyk.domain.BoardVO;
import org.lyk.persistence.BoardDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class BoardTest {

	@Inject
	private BoardDAO dao;
	
	@Test
	public void testcreate() throws Exception{
		
		BoardVO vo = new BoardVO();
		
		vo.setTitle("zzdzz");
		vo.setWriter("ysdk");
		vo.setContent("asdf");
		dao.create(vo);
	}
	@Test
	public void testdelete() throws Exception{
		BoardVO vo = new BoardVO();
		
		vo.setBno(59);
		dao.delete(vo);
	}
}