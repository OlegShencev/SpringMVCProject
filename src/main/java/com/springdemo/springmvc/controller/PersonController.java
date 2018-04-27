package com.springdemo.springmvc.controller;

import com.springdemo.springmvc.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class PersonController {

	@GetMapping(value = "/")
	public ModelAndView showForm() {
		return new ModelAndView("form", "person", new Person());
	}

	@PostMapping("/addPerson")
	public String submit(@Valid @ModelAttribute("person")Person person,
						 BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "form";
		}
		model.addAttribute("name", person.getName());
		model.addAttribute("age", person.getAge());
		return "person";
	}


}
