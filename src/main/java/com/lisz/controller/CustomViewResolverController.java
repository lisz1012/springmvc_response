package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
参看org.springframework.web.servlet.viewInternalResourceViewResolver 和 UrlBasedViewResolver的源码写出来的^_^
 */
@Controller
public class CustomViewResolverController {
	@RequestMapping("/testMSBResolver")
	public String testMBSResolver(){
		System.out.println("testMSBResolver");
		return "msb:/index.jsp";
	}

	@RequestMapping("/testMyViewResolver")
	public String testMyViewResolver(){
		System.out.println("testMyViewResolver");
		return "haha:/index.jsp";
	}
}
