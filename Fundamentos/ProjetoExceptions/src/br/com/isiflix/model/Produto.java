package br.com.isiflix.model;

import br.com.isiflix.exceptions.IsiException;

public class Produto {

	private int id;
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) throws IsiException {
		if (id <= 0) {
			throw new IsiException("Id não pode ser zero ou negativo");
		}
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) throws IsiException {
		if (descricao == null || descricao.length() == 0) {
			throw new IsiException("Descrição é obrigatória"); 
		}
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}

}
