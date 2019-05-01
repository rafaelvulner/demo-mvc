package com.monteiro.curso.boot.demomvc.service;

import java.util.List;

import com.monteiro.curso.boot.demomvc.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();

}
