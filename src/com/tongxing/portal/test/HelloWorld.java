package com.tongxing.portal.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloWorld {
	
	@RequestMapping("")
	@ResponseBody
	public String hello(){
		return "hello world";
	}
}
