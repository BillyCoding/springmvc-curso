package com.springmvc.curso.dao;

import java.util.List;

import com.springmvc.curso.domain.Departamento;

public interface DepartamentoDao {
	
	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Departamento departamento);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();
}
