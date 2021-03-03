package com.springmvc.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.curso.dao.DepartamentoDao;
import com.springmvc.curso.domain.Departamento;

@Service @Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoDao{
	
	@Autowired
	public DepartamentoDao dao;

	@Override
	public void save(Departamento departamento) {
		dao.save(departamento);
	}

	@Override
	public void update(Departamento departamento) {
		dao.update(departamento);
	}

	@Override
	public void delete(Departamento departamento) {
		dao.delete(departamento);
	}

	@Override @Transactional(readOnly = true)
	public Departamento findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Departamento> findAll() {
		return dao.findAll();
	}

}
