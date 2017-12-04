package com.juego.clases;

public class Personaje {
	String nombre;

	public Personaje(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Personaje [nombre del personaje:" + nombre + "]";
	}
	
}
