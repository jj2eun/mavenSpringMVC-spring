package com.java.member.dao;

import java.util.List;

import com.java.member.dto.MemberDto;
import com.java.member.dto.ZipcodeDto;

public interface MemberDao {
	public int memberinsert(MemberDto memberDto);
	
	public int memberidCheck(String id);

	public List<ZipcodeDto> zipcode(String dong);

	public int loginOk(String id, String password);
	
	
}
