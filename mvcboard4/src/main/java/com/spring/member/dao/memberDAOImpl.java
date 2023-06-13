package com.spring.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.member.vo.MemberVO;
//느슨한 결합(연동)
//DAO Repository 어노테이션을 선언해서 데이터베이스 처리부분이라고 선언

@Repository
public class memberDAOImpl implements memberDAO {
	//DAO 데이터베이스 처리를 위해 SqlSession 이용
	@Inject
	SqlSession sqlSession;
	String mapper = "memberMapper.";
		
	public List<MemberVO> memberList() {
		//mybatis에서 제공하는 메소드 insert,update,delete,select, selectList(모두조회), selectOne(1개조회)
		
		//return sqlSession.selectList("memberMapper.memberList"); //사용할 맵퍼명과 전달할 값 
		return sqlSession.selectList(mapper+"memberList"); //사용할 맵퍼명과 전달할 값
	}
	
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(mapper+"memberInsert", vo); //사용할 맵퍼명과 전달할 값

	}
	/*
	@Override
	public MemberVO viewMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}*/

}
