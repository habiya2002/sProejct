package com.spring.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.member.service.memberService;
import com.spring.member.vo.MemberVO;

//servlet doGet(request,response), doPost 메소드를 사용
//Spring에서 doGet, doPost 사용 않하고, 일반메소드에 어노테이션을 연결사용
//컨트롤영역 어노테이션 선언 -View와 연결
@Controller
public class memberController {
	@Inject
	memberService memberservice;
	
	//요청에 따른 페이지연결 RequestMapping 어노테이션으로 연결
	//RequestMapping("맵핑주소"),RequestMapping(value="맵핑주소", method=RequestMethod.GET/POST)
	@RequestMapping("member/list") //menu.jsp에 연결
	public String memberList(Model model) { //Model 앞페이지의 정보
		//목록을 조회를 해서 전달
		List<MemberVO> list = memberservice.memberList();
		model.addAttribute("list", list); //member_list.jsp에 items에 선언된 이름과 동일
		
		return "member_list";
	}
	
	@RequestMapping("member/write")
	public String memberwriteView() { //Model 앞페이지의 정보
		
		return "member_write";
	}
	
	//ModelAttribute : View에서 값을 전달받을 때(request)
	@RequestMapping(value="member/write", method=RequestMethod.POST)
	public String memberInsert(@ModelAttribute MemberVO vo) { //Model 앞페이지의 정보
		//서비스로 저장작업
		memberservice.insertMember(vo); //서버스를 통해 회원등록
		
		return "redirect:/member/list";  //목록으로 이동
	}
}
