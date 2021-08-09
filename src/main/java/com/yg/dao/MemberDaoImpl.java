package com.yg.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yg.dto.MemberDto;


@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public void insert(MemberDto dto) {
		sqlSession.insert("com.yg.mapper.MemberMapper.insertMember",dto);
	}
	
	
	@Override
	public List<MemberDto> selectList(){
		return sqlSession.selectList("com.yg.mapper.MemberMapper.selectAll");
	}
	
//	@Override
//	public List<MemberDto> selectListFromTo(int from, int to){
//		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
//		map1.put("num1", from);
//		map1.put("num2", to);
//		return sqlSession.selectList("com.yg.mapper.MemberMapper.selectBetween",map1);
//	}

}
