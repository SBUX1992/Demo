package kr.co.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// index 화면 구현
	@GetMapping(value = { "/", "index" })
	public String index() {
		return "index";
	}
	
}
