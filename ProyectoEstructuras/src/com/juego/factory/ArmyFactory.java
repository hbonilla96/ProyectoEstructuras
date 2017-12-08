package com.juego.factory;

import com.juego.armas.Arma;
import com.juego.armas.Bomba;
import com.juego.armas.CannonPlasma;
import com.juego.armas.Espada;
import com.juego.armas.Gancho;
import com.juego.clases.CategoriaArma;
import com.juego.clases.LlaveEspada;

public class ArmyFactory {
	public static Arma factory(CategoriaArma type) {
		switch(type) {
		case CannonPlasma:
			return new CannonPlasma(type);
		case Bomba:
			return new Bomba(type);
		case Espada:
			return new Espada(type);
		case Gancho:
			return new Gancho(type);
		case LlaveEspada:
			return new LlaveEspada(type);
		default:
			return new Espada(type);
		}
	}
}
