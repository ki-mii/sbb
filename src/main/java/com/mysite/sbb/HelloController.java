package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //컨트롤러의 애너테이션, 컨트롤러의 역할 수행
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody //문자열 출력할 때, 출력결과가 문자열 자체
	public String hello() {
		return "Hello World Boot Board!";
	}
	
	@GetMapping("/jump")
	@ResponseBody
	public String jump() {
		return "점프 투 스프링 부트";
	}
}
