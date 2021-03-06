package com.juego.clases;

import com.juego.estructuras.PilaAtaques;

public class Jugador {
	String nombre;
	int vida = 10;
	PilaAtaques ataques;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public PilaAtaques getAtaques() {
		return ataques;
	}
	public void setAtaques(PilaAtaques ataques) {
		this.ataques = ataques;
	}
	@Override
	public String toString() {
		return "Jugador [nombre de jugador:" + nombre + 
				", puntos obtenidos:" + vida + "]";
	}
	
}
