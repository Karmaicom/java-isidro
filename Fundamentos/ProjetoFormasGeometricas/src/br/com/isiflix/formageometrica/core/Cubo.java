package br.com.isiflix.formageometrica.core;

import br.com.isiflix.formageometrica.model.FormaGeometrica;
import br.com.isiflix.formageometrica.model.InterfaceForma2D;
import br.com.isiflix.formageometrica.model.InterfaceForma3D;

public class Cubo extends FormaGeometrica implements InterfaceForma2D, InterfaceForma3D {

	private Double lado;

	public Cubo(Double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public Double calcularVolume() {
		return Math.pow(this.lado, 3);
	}

	@Override
	public Double calcularArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public Double calcularPerimetro() {
		return this.lado * 4;
	}

	@Override
	public String toString() {
		return "Cubo de lado " + this.lado + " A: " + this.calcularArea() + " - P: " + this.calcularPerimetro() + " - V: " + this.calcularVolume();
	}

}
