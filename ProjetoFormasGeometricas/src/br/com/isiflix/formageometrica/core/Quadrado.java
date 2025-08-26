package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;

public class Quadrado extends FormaGeometrica implements InterfaceForma2D {

	private Double lado;

	public Quadrado(Double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public Double calcularArea() {
		return this.lado * this.lado;
	}

	@Override
	public Double calcularPerimetro() {
		return this.lado * 4;
	}

	@Override
	public String toString() {
		return "Quadrado de lado " + this.lado + " A: " + this.calcularArea() + " - P: " + this.calcularPerimetro();
	}

}
