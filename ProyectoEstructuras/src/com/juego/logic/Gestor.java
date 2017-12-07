package com.juego.logic;

import com.juego.estructuras.ListaJugadores;
import com.juego.estructuras.Nodo;

public class Gestor {
	private static ListaJugadores listJugadores;
	private static Nodo node;
	
	public void crearJugador(String nombre) {
		listJugadores.agregarAlInicio(nombre);
		listJugadores.listar();
	}
	
	
}
