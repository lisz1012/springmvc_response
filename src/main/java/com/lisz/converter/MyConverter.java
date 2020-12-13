package com.lisz.converter;

import com.lisz.bean.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

//@Component
public class MyConverter implements Converter<String, User> {
	@Override
	public User convert(String str) {
		System.out.println("-------------");
		if (str != null && str.length() > 0 && str.split("-").length == 4) {
			String strs[] = str.split("-");
			User user = new User();
			user.setId(Integer.parseInt(strs[0]));
			user.setName(strs[1]);
			user.setAge(Integer.parseInt(strs[2]));
			user.setGender(strs[3]);
			return user;
		}
		return null;
	}
}
