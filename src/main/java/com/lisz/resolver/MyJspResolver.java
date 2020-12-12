package com.lisz.resolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

public class MyJspResolver extends InternalResourceViewResolver {
	public MyJspResolver() {
		setPrefix("/WEB-INF/page/");
		setSuffix(".jsp");
	}
}
