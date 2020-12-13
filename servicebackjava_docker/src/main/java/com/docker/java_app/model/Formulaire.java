package com.docker.java_app.model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class Formulaire {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String response; 
	
	

	public String getResponse() {
		return response;
	}

	public String setResponse(String response) {
		return this.response = response;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Formulaire [id=" + id + ", name=" + name + ", response=" + response + "]";
	}


	
}
