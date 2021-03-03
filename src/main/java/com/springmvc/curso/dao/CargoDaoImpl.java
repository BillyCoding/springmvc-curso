package com.springmvc.curso.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.curso.domain.Cargo;

@Repository
public abstract class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}
