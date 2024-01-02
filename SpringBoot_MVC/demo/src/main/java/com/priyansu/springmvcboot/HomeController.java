package com.priyansu.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() 
	{
		return "index";
	}	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") double i, 
			@RequestParam("num2") double j) 
	{	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		double num3 = i + j;
		mv.addObject("num", num3);
		return mv;
	}
}
