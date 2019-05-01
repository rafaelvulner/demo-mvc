package com.monteiro.curso.boot.demomvc.dao;

import org.springframework.stereotype.Repository;

import com.monteiro.curso.boot.demomvc.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}
