package com.lisz.controller;

import com.lisz.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*
自定义类型转换器的时候一定要注意对应的属性值跟方法中的参数值要对应起来
 */
@Controller
public class MyConverterController {

	@RequestMapping("/convert")
	public String testConverter(User user, Model model){
		System.out.println(user);
		model.addAttribute("user", user);
		return "success";
	}
}
