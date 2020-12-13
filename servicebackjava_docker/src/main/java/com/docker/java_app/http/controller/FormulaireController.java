package com.docker.java_app.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.docker.java_app.dao.FormulaireRepository;
import com.docker.java_app.model.Formulaire;

@Controller
//@RequestMapping(path="/dockergo")
public class FormulaireController {

//	@Autowired
//	private FormulaireRepository formRepository;
	      
	@GetMapping(path="/")
	public String accueil(Model model) {
		Formulaire form = new Formulaire();
		form.setName("");
		model.addAttribute("form", form);
		return "HelloWorld";
	}     
	 
	@GetMapping(path="/hello/{name}")
	public String postHello(@RequestParam (name = "name", required = false, defaultValue = "Amelie") String name, Model model) {
		Formulaire form = new Formulaire();
		model.addAttribute("form", form);
		form.setName(name);
		form.setResponse("Bonjour " + form.getName().toString() + ", vous êtes bien matinal !");
		String response = form.getResponse().toString();
		
		return "Valide";
	
	}
}
