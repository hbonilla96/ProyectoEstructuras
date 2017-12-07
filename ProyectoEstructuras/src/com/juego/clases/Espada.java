package com.juego.clases;

public class Espada extends Arma {

	public Espada(CategoriaArma type) {
		super(type);
		this.da�o = 2;
	}

	@Override
	public String toString() {
		return "Espada [tipo=" + tipo + ", da�o=" + da�o + "]";
	}
}
