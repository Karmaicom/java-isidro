package br.com.isiflix.projetoempresa.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@GeneratedValue
	@Column(name = "numero_id", columnDefinition = "CHAR(36)", nullable = false)
	private UUID numeroId;

	@Column(name = "nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "andar", nullable = false)
	private int andar;

	public Departamento() {
	}

	public Departamento(UUID numeroId, String nome, int andar) {
		super();
		this.numeroId = numeroId;
		this.nome = nome;
		this.andar = andar;
	}

	public UUID getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(UUID numeroId) {
		this.numeroId = numeroId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	@Override
	public String toString() {
		return "Departamento [numeroId=" + numeroId + ", nome=" + nome + ", andar=" + andar + "]";
	}

}
