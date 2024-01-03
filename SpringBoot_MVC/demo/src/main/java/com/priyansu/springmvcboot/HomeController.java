package com.priyansu.springmvcboot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@RequestMapping("add")
	public String add(@RequestParam("num1") double i, 
			@RequestParam("num2") double j, Model m) 
	{	
		double num3 = i + j;
		m.addAttribute("num", num3);
		return "result";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@RequestParam("aid") int aid, 
			@RequestParam("aname") String aname, Model m)
	{
		Alien a = new Alien();
		a.setAid(aid);
		a.setAname(aname);
		
		m.addAttribute("alien", a);
		return "result";
	}
}
