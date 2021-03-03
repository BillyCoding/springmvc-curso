package com.springmvc.curso.service;

import java.util.List;

import com.springmvc.curso.domain.Cargo;

public interface CargoService {
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
}
