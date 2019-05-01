package com.monteiro.curso.boot.demomvc.dao;

import java.util.List;

import com.monteiro.curso.boot.demomvc.domain.Funcionario;

public interface FuncionarioDao {
	
	void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

}
