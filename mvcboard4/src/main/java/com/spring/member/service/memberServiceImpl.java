package com.spring.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.member.dao.memberDAO;
import com.spring.member.vo.MemberVO;

//서비스 영역은 어노테이션 Service로 선언
@Service
public class memberServiceImpl implements memberService {
	//DAO를 호출해서 자료를 처리하는 목적
	@Inject
	memberDAO memberDao;
		
	public List<MemberVO> memberList() {
		// Dao에 선언된 메소드를 호출
		return memberDao.memberList();
	}
	
	public void insertMember(MemberVO vo) {
		memberDao.insertMember(vo);	
	}

}
