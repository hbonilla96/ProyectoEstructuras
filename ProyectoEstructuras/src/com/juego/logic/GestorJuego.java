package com.juego.logic;

import com.juego.clases.Personaje;
import com.juego.estructuras.ListaJugadores;
import com.juego.estructuras.Nodo;

public class GestorJuego {
	private static ListaJugadores listJugadores = new ListaJugadores();
	private static Personaje jugador;
	
	public void crearJugador(String nombre) {
		jugador = new Personaje(nombre);
		agregarLista(jugador);
	
	}
	public void agregarLista(Personaje player) {
		listJugadores.agregarAlInicio(player);
	}
	public void listarJugadores() {
		listJugadores.listar();
	}
	public void elegirArmas() {
		
	}
}
