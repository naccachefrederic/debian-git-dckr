package com.docker.java_app.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.docker.java_app.dao.FormulaireRepository;

@Controller
//@RequestMapping(path="/dockergo")
public class FormulaireController {

	@Autowired
	private FormulaireRepository formRepository;
	
	@GetMapping(value="/")
	public String accueil(Model model) {
		model.addAttribute("name", "");
		return "HelloWorld";
	}
	
	@PostMapping(value="/hello/{name}")
	public String postHello(@PathVariable String name, Model model) {
		model.addAttribute("name",name);
		return "HelloWorld";
	
	}
}
