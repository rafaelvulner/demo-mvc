package com.monteiro.curso.boot.demomvc.service;

import java.util.List;

import com.monteiro.curso.boot.demomvc.domain.Departamento;

public interface DepartamentoService {
	
		boolean departamentoTemCargos(Long id);

		void salvar(Departamento departamento);

	    void editar(Departamento departamento);

	    void excluir(Long id);

	    Departamento buscarPorId(Long id);
	    
	    List<Departamento> buscarTodos();

}
