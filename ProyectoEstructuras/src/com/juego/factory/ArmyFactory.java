package com.juego.factory;

import com.juego.clases.Arma;
import com.juego.clases.Bomba;
import com.juego.clases.CannonPlasma;
import com.juego.clases.CategoriaArma;
import com.juego.clases.Espada;
import com.juego.clases.Gancho;
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
