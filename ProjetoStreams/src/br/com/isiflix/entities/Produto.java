package br.com.isiflix.entities;

public class Produto {

	private int id;
	private String descicao;
	private double preco;
	private int quantidade;

	public Produto() {
	}

	public Produto(int id, String descicao, double preco, int quantidade) {
		super();
		this.id = id;
		this.descicao = descicao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescicao() {
		return descicao;
	}

	public void setDescicao(String descicao) {
		this.descicao = descicao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descicao=" + descicao + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

}
