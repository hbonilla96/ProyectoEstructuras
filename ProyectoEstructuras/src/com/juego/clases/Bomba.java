package com.juego.clases;

public class Bomba extends Arma {

	public Bomba(CategoriaArma type) {
		super(type);
		this.daño = 3;
	}

	@Override
	public String toString() {
		return "Bomba [tipo=" + tipo + ", daño=" + daño + "]";
	}

}
