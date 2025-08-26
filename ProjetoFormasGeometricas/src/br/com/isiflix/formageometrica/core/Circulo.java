package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;

public class Circulo extends FormaGeometrica implements InterfaceForma2D {
	
	private Double raio;

	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public Double calcularArea() {
		return Math.pow(this.raio, 2) * Math.PI;
	}

	@Override
	public Double calcularPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	@Override
	public String toString() {
		return "Círculo de Raio " + this.raio + " A: " + this.calcularArea() + " - P: " + this.calcularPerimetro();
	}

}
