package com.springmvc.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.curso.dao.FuncionarioDao;
import com.springmvc.curso.domain.Funcionario;

@Service @Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioDao{
	
	@Autowired
	public FuncionarioDao dao;

	@Override
	public void save(Funcionario funcionario) {
		dao.save(funcionario);
	}

	@Override
	public void update(Funcionario funcionario) {
		dao.update(funcionario);
	}

	@Override
	public void delete(Funcionario funcionario) {
		dao.delete(funcionario);
	}

	@Override @Transactional(readOnly = true)
	public Funcionario findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Funcionario> findAll() {
		return dao.findAll();
	}

}
