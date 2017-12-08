package com.juego.logic;

import com.juego.clases.Arma;
import com.juego.clases.CategoriaArma;
import com.juego.clases.Jugador;
import com.juego.estructuras.ListaJugadores;
import com.juego.estructuras.Nodo;
import com.juego.estructuras.PilaAtaques;
import com.juego.factory.ArmyFactory;

public class GestorJuego {
	private static ListaJugadores listJugadores = new ListaJugadores();
	private static Jugador player;
	private static ArmyFactory factory;
	private static Arma arm = new Arma();
	private static PilaAtaques atacs = new PilaAtaques();
	
	public void crearJugador(String nombre) {
		player = new Jugador(nombre);
		agregarLista(player);
	}
	public void agregarLista(Jugador player) {
		listJugadores.agregarAlInicio(player);
	}
	public void listarJugadores() {
		listJugadores.listar();
	}
	public void elegirArmas(CategoriaArma type)throws Exception {
		arm = ArmyFactory.factory(type);
		if(arm!=null) {
			asignarArmas(arm.getTipo().name());
		}else {
			System.out.println("Arma nula");
		}
	}
	public void asignarArmas(String arm) throws Exception{
		System.out.println(arm);
		if(arm!=null) {
		atacs.apilar(arm);
		player.setAtaques(atacs);
		player.getAtaques().listar();
		}else {
			System.out.println("Arma nula");
		}
	}
}
