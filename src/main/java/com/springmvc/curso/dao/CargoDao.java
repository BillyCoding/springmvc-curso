package com.springmvc.curso.dao;

import java.util.List;

import com.springmvc.curso.domain.Cargo;

public interface CargoDao {

	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Cargo cargo);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
}
