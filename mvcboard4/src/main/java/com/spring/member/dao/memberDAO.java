package com.spring.member.dao;

import java.util.List;

import com.spring.member.vo.MemberVO;

//느슨한 연동
//하나의 뼈대로 유사한 작업을 통일화해서 만들기 위해
//내용은 없음. 메소드 선언
public interface memberDAO {
	//선언시 메소드 뒤에 ;
	//회원목록
	public List<MemberVO> memberList(); //여러회원의 정보를 조회
	
	//회원등록
	public void insertMember(MemberVO vo); //한명의 정보를 저장
/*	
	//회원상세(수정시 필요)
	public MemberVO viewMember(); //한명의 정보를 조회
	
	//회원삭제
	public void deleteMember(String userid);
	
	//회원수정
	public void updateMember(MemberVO vo); //한명의 정보를 수정*/
}
//가능하면 인터페이스 앞으로 사용할 메소드를 미리 작성