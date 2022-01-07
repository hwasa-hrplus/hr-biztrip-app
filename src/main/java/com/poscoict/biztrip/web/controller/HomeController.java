package com.poscoict.biztrip.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {	

	/** * 메인 페이지 이동 * @return */
	@GetMapping("/")
	public String main() {
		return "index";
	}	
}
