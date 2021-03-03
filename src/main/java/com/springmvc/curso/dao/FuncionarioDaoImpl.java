package com.springmvc.curso.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.curso.domain.Funcionario;

@Repository
public abstract class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
