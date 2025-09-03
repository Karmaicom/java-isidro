package br.com.isiflix.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.projetoempresa.dao.DepartamentoDAO;
import br.com.isiflix.projetoempresa.models.Departamento;

@RestController
@RequestMapping(value = "/api/departamentos")
public class DepartamentoController {

	@Autowired
	private DepartamentoDAO dao;
	
	@GetMapping
	public ArrayList<Departamento> recuperarTodos() {
		return (ArrayList<Departamento>) dao.findAll();
	}
}
