package com.springmvc.curso.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.curso.domain.Departamento;

@Repository
public abstract class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao{

}
