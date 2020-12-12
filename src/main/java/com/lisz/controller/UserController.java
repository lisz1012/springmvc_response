package com.lisz.controller;

import com.lisz.bean.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/*
在使用@ModelAttributes的时候要注意：
1。如果参数中的注解没写名字，默认是按照参数名称首字母小写来匹配
2。如果有值则直接返回，如果没有，则去Session中查找，也就是说是会查看当前类上是否添加了@SessionAttributes注解，推荐总是添加参数，不依赖默认值
 */
@Controller
public class UserController {
	Object o1 = null;
	Object o2 = null;
	Model m1 = null;

	@GetMapping("/update")
	public String update() {
		return "update";
	}

	/*
	先执行 @ModelAttribute 标识的方法 testModelAttrbute，放进"user"那个对象，然后用同样的注解，传入key "user"拿到testModelAttrbute
	所放进去的User对象. 其实还是通过Model（BindingAwareModelMap）来赋值的。"user"这个key，必须相同才能取到当初设置进去的对象。
	包含@ModelAttribute的方法都会被扫描到并执行
	 */
	@PostMapping("/update")
	public String update(@ModelAttribute("user1") User user, Model model) {
		System.out.println("222");
		o1 = user;
		System.out.println(user);
		System.out.println(o1 == o2);
		System.out.println(m1 == model);
		return "success";
	}

//	// 包含@ModelAttribute的方法都会被扫描到并执行 (相当于一个非正式的拦截器或者过滤器), 不管api方法带不带User参数
//	// 或者@ModelAttribute("user")，都会执行@ModelAttribute注解的方法。似乎只会替换model中的对象中为null的field
//	@ModelAttribute
//	public void testModelAttrbute(Model model){
//		m1 = model;
//		System.out.println("111");
//		User user = new User();
//		user.setId(2);
//		user.setName("lisi");
//		user.setAge(11);
//		user.setPassword("123");
//		model.addAttribute("user", user);
//		o2 = user;
//		System.out.println(m1 == model);
//	}
//
//	@ModelAttribute
//	public void testModelAttribute2(){
//		System.out.println("Model Attribute ---------------- ");
//	}

	// 可以传个value参数，修饰返回值的key，这样在API方法的参数中，修饰参数的时候也要这么用相同的value="user1"为key取.
	// 不设定这个value的时候，如果API方法取值的时候限定了value，则会取不到；如果API方法也没有限定value，则按类型匹配，能取到值
	@ModelAttribute("user1")
	public User testModelAttrbute3(){
		System.out.println("testModelAttribute3 --------------- ");
		User user1 = new User();
		user1.setId(2);
		user1.setName("lisi");
		user1.setAge(11);
		user1.setPassword("123");
		o2 = user1;
		return user1;
	}

	@GetMapping("/update2")
	public String update2() {
		System.out.println("update2");
		return "success";
	}
}
