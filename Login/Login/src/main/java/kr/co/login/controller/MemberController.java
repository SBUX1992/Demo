package kr.co.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.login.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class MemberController {
	
	// 로그인 화면 구현
	@GetMapping("member/login")
	public String login() {
		return "member/login";
	}

	// 회원가입 화면 구현
	@GetMapping("member/register")
	public String register() {
		log.info("회원가입 화면");
		return "member/register";
	}
	
	// 회원가입 post
	@PostMapping("member/register")
	public String register(MemberVO vo) {
		log.info("회원가입 완료");
		return "redirect:/member/login";
	}
	

}
