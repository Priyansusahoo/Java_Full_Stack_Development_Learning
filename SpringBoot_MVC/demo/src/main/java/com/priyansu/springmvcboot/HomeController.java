package com.priyansu.springmvcboot;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
import com.priyansu.springmvcboot.model.Alien;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() 
	{
		return "index";
	}	
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") double i, 
//			@RequestParam("num2") double j, Model m) 
//	{	
//		double num3 = i + j;
//		m.addAttribute("num", num3);
//		return "result";
//	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("alien") Alien a)
	{		
		return "result";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		List<Alien> aliens = Arrays.asList(new Alien(1, "Priyansu"), new Alien(2, "Thanos"));
		m.addAttribute("result", aliens);
		return "showAliens";
	}
}
