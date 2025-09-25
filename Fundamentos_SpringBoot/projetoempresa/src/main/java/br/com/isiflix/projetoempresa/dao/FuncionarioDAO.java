package br.com.isiflix.projetoempresa.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.isiflix.projetoempresa.models.Funcionario;

public interface FuncionarioDAO extends CrudRepository<Funcionario, UUID> {
	
}
