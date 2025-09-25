package br.com.isiflix.projetoempresa.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {

	@Id
	@GeneratedValue
	@Column(name = "num_funcional", columnDefinition = "CHAR(36)", nullable = false)
	private UUID numFuncional;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "email", length = 100, nullable = false, unique = true)
	private String email;
	
	@Column(name = "salario")
	private double salario;
	
	@ManyToOne
	@JoinColumn(name = "numero_id")
	private Departamento depto;

	public UUID getNumFuncional() {
		return numFuncional;
	}

	public void setNumFuncional(UUID numFuncional) {
		this.numFuncional = numFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

}
