package com.docker.java_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.java_app.model.Formulaire;

public interface FormulaireRepository extends JpaRepository<Formulaire, Integer> {

	
}
