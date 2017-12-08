package com.juego.clases;

public class Arma {
	protected CategoriaArma tipo;
	protected int da�o;
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
	public int getDa�o() {
		return da�o;
	}
	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}


	@Override
	public String toString() {
		return "Arma [tipo=" + tipo + ", da�o=" + da�o + "]";
	}
	
}
