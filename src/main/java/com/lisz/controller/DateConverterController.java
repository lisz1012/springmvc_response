package com.lisz.controller;

import com.lisz.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
如果使用默认的类型转换器，则在输入日期的时候必须使用/作为分隔。如果需要自定义实现该如何操作？
在Date类型的属性上面加上 @DateTimeFormat(pattern = "yyyy-MM-dd") 然后在spring的xml配置文件中加上：
<bean id="conversionService" class="org.springframework.format.support.FormattingConversionServiceFactoryBean">
	<property name="converters">
	    <set>
	        <ref bean="myConverter" />
	    </set>
	</property>
</bean>
如果需要添加日期格式化器，只需要在实体类上添加 @DateTimeFormat(pattern = "yyyy-MM-dd")即可，但是需要注意：
如果再配置日期格式化器的时候，同时配置了类型转换器，那么此时日期格式化器就会失效，除非把日期写成"yyyy/MM/dd"。
需要在spring的xml中配置FormattingConversionServiceFactoryBean对象
 */
@Controller
public class DateConverterController {
	@RequestMapping("/testDateConverter")
	public String testDateConverter(User user){
		System.out.println(user);
		return "success";
	}
}
