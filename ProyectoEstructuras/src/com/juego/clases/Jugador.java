package com.juego.clases;

public class Jugador {
	String nombre;
	int puntos = 10;
	public Jugador(String nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Jugador [nombre de jugador:" + nombre + 
				", puntos obtenidos:" + puntos + "]";
	}
	
}
