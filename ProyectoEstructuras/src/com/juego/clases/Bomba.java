package com.juego.clases;

public class Bomba extends Arma {

	public Bomba(CategoriaArma type) {
		super(type);
		this.da�o = 3;
	}

	@Override
	public String toString() {
		return "Bomba [tipo=" + tipo + ", da�o=" + da�o + "]";
	}

}
