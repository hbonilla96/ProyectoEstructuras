package com.juego.clases;

public class Jugador {
	String nombre;
	int vida = 10;
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
	public int getPuntos() {
		return vida;
	}
	public void setPuntos(int vida) {
		this.vida = vida;
	}
	@Override
	public String toString() {
		return "Jugador [nombre de jugador:" + nombre + 
				", puntos obtenidos:" + vida + "]";
	}
	
}
