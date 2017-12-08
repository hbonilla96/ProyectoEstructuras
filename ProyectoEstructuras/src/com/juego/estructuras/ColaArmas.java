package com.juego.estructuras;

public class ColaArmas {

	Nodo inicio, fin;
	int tamanno;
	
	public ColaArmas() {
		inicio = fin = null;
		tamanno = 0;
	}
	
	public boolean esVacia() {
		return inicio == null;
	}
	
	public void insertar(String parma) {
		Nodo nuevo = new Nodo();
		nuevo.setValor(parma);
		if(esVacia()) {
			inicio = nuevo;
		}else{
			fin.setSiguiente(nuevo);
		}
		fin = nuevo;
		tamanno++;
	}
}
