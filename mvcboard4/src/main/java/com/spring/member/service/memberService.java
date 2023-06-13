package com.spring.member.service;

import java.util.List;

import com.spring.member.vo.MemberVO;
//Service 영역은 DAO<-Service->Controller
//DAO에서 처리된 내용을 Controller에게 전달하는 역할
public interface memberService {
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
