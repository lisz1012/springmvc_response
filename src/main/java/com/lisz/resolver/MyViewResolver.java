package com.lisz.resolver;

import com.lisz.view.MyView;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

//@Component
// @Ordered(1) //如果有多个都是Component注解标识的，则需要为它们制定个顺序
public class MyViewResolver implements ViewResolver, Ordered {
	private int order = 0;
	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		if (viewName.startsWith("haha:")) {
			System.out.println(viewName);
			return new MyView();
		}
		return null;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public int getOrder() {
		return order;
	}
}
