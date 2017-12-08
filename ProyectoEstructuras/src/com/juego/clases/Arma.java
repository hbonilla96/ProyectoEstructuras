package com.juego.clases;

public class Arma {
	protected CategoriaArma tipo;
	protected int daño;
	protected Arma siguiente;
	
	public Arma(CategoriaArma type) {
		this.tipo = type;
	}
	public Arma() {
		
	}
	
	
	public Arma getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Arma siguiente) {
		this.siguiente = siguiente;
	}
	public CategoriaArma getTipo() {
		return tipo;
	}
	public void setTipo(CategoriaArma tipo) {
		this.tipo = tipo;
	}
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}


	@Override
	public String toString() {
		return "Arma [tipo=" + tipo + ", daño=" + daño + "]";
	}
	
}
