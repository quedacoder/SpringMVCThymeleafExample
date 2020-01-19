package com.quedacoder.MvcThymeleafExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/hello")
	public String sayHelloWorld(Model model) {
		
		model.addAttribute("newDate", new java.util.Date());
		return "home";
	}

}
