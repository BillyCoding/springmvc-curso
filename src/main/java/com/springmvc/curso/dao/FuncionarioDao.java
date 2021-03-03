package com.springmvc.curso.dao;

import java.util.List;

import com.springmvc.curso.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Funcionario funcionario);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
