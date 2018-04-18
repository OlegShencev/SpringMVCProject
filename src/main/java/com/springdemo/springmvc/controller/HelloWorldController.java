package com.springdemo.springmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;

@Controller
public class HelloWorldController {

	@GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
	public String sayHello(ModelMap model) {
		model.addAttribute("helloworld", "Здравствуй мир!");
		return "welcome";
	}
}
