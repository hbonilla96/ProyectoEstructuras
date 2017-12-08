package com.juego.armas;

import com.juego.clases.CategoriaArma;

public class Espada extends Arma {

	public Espada(CategoriaArma type) {
		super(type);
		this.daño = 2;
	}

	@Override
	public String toString() {
		return "Espada [tipo=" + tipo + ", daño=" + daño + "]";
	}
}
