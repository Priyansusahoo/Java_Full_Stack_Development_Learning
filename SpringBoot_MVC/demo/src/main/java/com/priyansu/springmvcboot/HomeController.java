package com.priyansu.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() 
	{
		return "index.jsp";
	}	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, 
			@RequestParam("num2") int j,
			HttpSession session) 
	{		
		int num3 = i + j;
		session.setAttribute("num3", num3);
		return "result.jsp";
	}
}
