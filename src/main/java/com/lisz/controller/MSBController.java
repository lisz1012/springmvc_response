package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
参看org.springframework.web.servlet.viewInternalResourceViewResolver 和 UrlBasedViewResolver的源码写出来的^_^
 */
@Controller
public class MSBController {
	@RequestMapping("/testMSBResolver")
	public String testMBSResolver(){
		System.out.println("testMSBResolver");
		return "msb:/index.jsp";
	}
}
