package com.juego.logic;

import java.util.ArrayList;
import com.juego.clases.Jugador;
import java.util.EnumSet;
import com.juego.estructuras.ListaJugadores;
import com.juego.estructuras.Nodo;

public class GestorJuego {
	private static ListaJugadores listJugadores = new ListaJugadores();
	private static Jugador jugador;
	
	public void crearJugador(String nombre) {
		jugador = new Jugador(nombre);
		agregarLista(jugador);
	
	}
	public void agregarLista(Jugador player) {
		listJugadores.agregarAlInicio(player);
	}
	public void listarJugadores() {
		listJugadores.listar();
	}
}

