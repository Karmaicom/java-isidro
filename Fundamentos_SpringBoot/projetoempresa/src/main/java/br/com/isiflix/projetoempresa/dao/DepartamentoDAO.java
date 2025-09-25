package br.com.isiflix.projetoempresa.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.isiflix.projetoempresa.models.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, UUID> {

	public List<Departamento> findByOrderByNome();
	
	public List<Departamento> findByAndar(int andar);
	
}
