package org.lyk.service;

import java.util.List;

import org.lyk.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> read(Integer page) throws Exception;
	public void create(BoardVO vo) throws Exception;
	public BoardVO view(Integer bno) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(BoardVO vo) throws Exception;
}