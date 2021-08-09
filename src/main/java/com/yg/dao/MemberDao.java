package com.yg.dao;

import java.util.List;

import com.yg.dto.MemberDto;

public interface MemberDao {
	void insert(MemberDto dto);
	
	List<MemberDto> selectList();
}
