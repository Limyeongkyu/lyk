package org.lyk.persistence;

import java.util.List;

import javax.inject.Inject;

import org.lyk.domain.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public List<BoardVO> read(Integer page) {
		List<BoardVO> list = sqlSession.selectList("org.lyk.persistence.BoardMapper.read",(page-1)*10);                                //(page-1)*10)
		return list;
	}

	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert("org.lyk.persistence.BoardMapper.create", vo);

	}

	@Override
	public BoardVO view(Integer bno) throws Exception {
		
		
		return sqlSession.selectOne("org.lyk.persistence.BoardMapper.view",bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		
		sqlSession.update("org.lyk.persistence.BoardMapper.update",vo);

	}

	@Override
	public void delete(BoardVO vo) throws Exception {
		
		sqlSession.delete("org.lyk.persistence.BoardMapper.delete",vo);

	}

	@Override
	public int totalCount() {
		
		
		return sqlSession.selectOne("org.lyk.persistence.BoardMapper.totalCount");
	}

}
