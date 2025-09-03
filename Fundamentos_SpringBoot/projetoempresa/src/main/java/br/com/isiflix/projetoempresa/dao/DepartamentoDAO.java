package br.com.isiflix.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isiflix.projetoempresa.models.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

}
