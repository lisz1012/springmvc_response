package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 不会经过InternalResourceViewResolver
@Controller
public class RedirectController {

	@RequestMapping("/redirect")
	public String redirect(){
		System.out.println("redirect");
		return "redirect:/index.jsp";
	}

	// 多倒一把手，多次转发
	@RequestMapping("/redirect2")
	public String redirect2(){
		System.out.println("redirect2");
		return "redirect:/redirect";
	}
}
