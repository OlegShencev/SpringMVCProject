package com.springdemo.springmvc.controller;

import com.springdemo.springmvc.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class PersonController {

/*	@GetMapping(value = "/")
	public String sayHello(ModelMap model) {
		model.addAttribute("helloworld", "Здравствуй мир!");
		return "welcome";
	}*/

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("form", "person", new Person());
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute(" person")Person person,
						 BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "form";
		}
		model.addAttribute("name", person.getName());
		model.addAttribute("age", person.getAge());
		return "person";
	}


}
