package com.docker.java_app.http.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.java_app.dao.FormulaireRepository;

@RestController
@RequestMapping(path="dockergo")
public class FormulaireController {

	@Autowired
	private FormulaireRepository formRepository;
	
	@GetMapping(value="/hello/{name}")
	public List<String> sayHello(@PathVariable String name) {
		List<String> l = new ArrayList<>();
		String rep ="Bonjour "+ name +" ... Vous êtes bien matinal ...";
		l.add(rep);
		return l;
	}
	
	@PostMapping(value="/hello/{name}")
	public @ResponseBody List<String> postHello(@PathVariable String name) {
		List<String> l = new ArrayList<>();
		String rep ="Bonjour "+ name +" ... Vous êtes bien matinal ...";
		l.add(rep);
		return l;
	
	}
}
