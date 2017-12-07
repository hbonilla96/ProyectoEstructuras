package com.juego.estructuras;

public class Nodo {
	private String valor;
	private Nodo siguiente;
	
	public void Nodo(String nombre){
		this.valor = nombre;
		this.siguiente = null;
	}
	
	public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
    
}
