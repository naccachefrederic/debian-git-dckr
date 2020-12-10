package com.docker.java_app.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.docker.java_app.dao.FormulaireRepository;
import com.docker.java_app.model.Formulaire;

@Controller
//@RequestMapping(path="/dockergo")
public class FormulaireController {

	@Autowired
	private FormulaireRepository formRepository;
	      
	@GetMapping(value="/")
	public String accueil(Model model) {
		Formulaire form = new Formulaire();
		form.setName("");
		model.addAttribute("form", form);
		return "HelloWorld";
	}     
	 
	@GetMapping(value="/hello/{name}")
	public String postHello(@PathVariable String name, Model model) {
		Formulaire newform = new Formulaire();
		newform.setName(name);
		model.addAttribute("newform",newform);
		return "Valide";
	
	}
}
