package com.lisz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/*
在向页面回显数据的时候可以在方法放的参数中显式声明
Map
Model
ModelMap
都可以将数据进行显示，回显之后的数据是保存在哪个作用域中的？
page: 当前页面
request: 当前请求
session: 当前回话
application: 当前应用
当使用上述参数传递数据的时候，会把数据都放置到request作用域中
Map、Model、ModelMap都会转化成class org.springframework.validation.support.BindingAwareModelMap

 */
@Controller
// value和types都写上表示Session中可以存储名字为value值的参数，以及类行为Integer的参数，可以只写一个types = String.class, 表示
// 所有String类型的参数都放到Session中去。value和types可以分开单独使用，但是尽量不要使用types，因为会把所有符合types的数据都设置到
// Session中，导致异常，比如Session满了
@SessionAttributes(value = {"username","hw"}, types = Integer.class) // value字段最好都做上标识
public class OutputController {

	@RequestMapping("/output")
	public String output(Map<String, String> map) {
		map.put("hw", "Hello, world");
		System.out.println(map.getClass());
		return "success";
	}

	@RequestMapping("/output2")
	public String output2(Model model) {
		model.addAttribute("hw", "Hello, world - 2");
		System.out.println(model.getClass());
		return "success";
	}

	@RequestMapping("/output3")
	public String output3(ModelMap modelMap) {
		modelMap.addAttribute("hw", "Hello, world - 3");
		System.out.println(modelMap.getClass());
		return "success";
	}

	/*
	所有的Map、Model、ModelMap等对象都会注入到ModelAndView里面
	 */
	@RequestMapping("/output4")
	public ModelAndView output4() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("success");
		modelAndView.addObject("hw", "Hello, world - 4");
		System.out.println(modelAndView.getClass());
		return modelAndView;
	}

	/*
	当需要向Session中设置数据的时候可以在当前的Controller上面添加@SessionAttributes注解，表示每次向request作用域中设置属性值的时候，
	顺带着向session中保存一份
	 */
	@RequestMapping("/testSession")
	public String testSession(Model model) {
		model.addAttribute("username", "zhangsan");
		return "success";
	}
}
