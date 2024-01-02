package com.priyansu.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
//		System.out.println("Home Page requested...");
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(HttpServletRequest req) {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int num3 = i + j;
		HttpSession session = req.getSession();
		session.setAttribute("num3", num3);
		return "result.jsp";
	}
}
