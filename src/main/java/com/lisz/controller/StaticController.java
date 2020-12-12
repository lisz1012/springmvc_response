package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController {

	@RequestMapping("/static")
	public String testStatic(){
		System.out.println("static");
		return "forward:/index.jsp";
	}

	@RequestMapping("/static2")
	public String testStatic2(){
		System.out.println("static2");
		return "/WEB-INF/page/success.jsp";//"/index.jsp";
	}
}
