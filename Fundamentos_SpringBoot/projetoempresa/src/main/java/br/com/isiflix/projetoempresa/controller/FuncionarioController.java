package br.com.isiflix.projetoempresa.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.projetoempresa.dao.FuncionarioDAO;
import br.com.isiflix.projetoempresa.models.Funcionario;

@RestController
@RequestMapping(value = "/api/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioDAO dao;
	
	@GetMapping("/{id}")
	public Optional<Funcionario> findById(@PathVariable UUID id) {
		Optional<Funcionario> func = dao.findById(id);
		return func;
	}
	
	
}
