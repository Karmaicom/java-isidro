package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma3D;

public class Paralelepipedo extends FormaGeometrica implements InterfaceForma3D {

	private Double altura;
	private Double largura;
	private Double profundidade;

	public Paralelepipedo(Double altura, Double largura, Double profundidade) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}

	@Override
	public Double calcularVolume() {
		return this.altura * this.largura * this.profundidade;
	}

	@Override
	public String toString() {
		return "Paralelepipedo de medidas (a/l/p) " + this.altura + "/" + this.largura + "/" + this.profundidade + " V: " + this.calcularVolume();
	}

	
}
