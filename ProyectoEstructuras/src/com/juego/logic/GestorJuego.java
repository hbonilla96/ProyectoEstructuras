package com.juego.logic;

import com.juego.estructuras.ListaJugadores;
import com.juego.estructuras.Nodo;

public class GestorJuego {
	private static ListaJugadores listJugadores = new ListaJugadores();
	private static Nodo node;
	
	public void crearJugador(String nombre) {
		node = new Nodo();
		node.setValor(nombre);
		agregarLista(node);
	
	}
	public void agregarLista(Nodo node) {
		listJugadores.agregarAlInicio(node.getValor());
	}
	public void listarJugadores() {
		listJugadores.listar();
	}
}
