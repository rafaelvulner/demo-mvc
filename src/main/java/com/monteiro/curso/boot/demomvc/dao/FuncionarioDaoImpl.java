package com.monteiro.curso.boot.demomvc.dao;

import org.springframework.stereotype.Repository;

import com.monteiro.curso.boot.demomvc.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
