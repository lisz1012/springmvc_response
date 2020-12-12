package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
"forward:/index.jsp"; 不会经过InternalResourceViewResolver
 */
@Controller
public class ForwardController {

	@RequestMapping("/forward")
	public String forward(){
		System.out.println("forward");
		return "forward:/index.jsp";
	}

	// 多倒一把手，多次转发
	@RequestMapping("/forward2")
	public String forward2(){
		System.out.println("forward2");
		return "forward:/forward";
	}
}
