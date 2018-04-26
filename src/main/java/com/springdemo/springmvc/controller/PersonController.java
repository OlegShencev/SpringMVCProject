package com.springdemo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloWorldController {

	@GetMapping(value = "/")
	public String sayHello(ModelMap model) {
		model.addAttribute("helloworld", "Здравствуй мир!");
		return "welcome";
	}


}
