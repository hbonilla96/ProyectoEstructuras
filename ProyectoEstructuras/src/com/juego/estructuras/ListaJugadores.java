package com.juego.estructuras;

import com.juego.clases.Jugador;

public class ListaJugadores {
	private Nodo inicio;
	private int tamanno;
	
	public void Lista(){
        inicio = null;
        tamanno = 0;
    }
	
	public boolean esVacia(){
        return inicio == null;
    }
	
	public int getTamanio(){
        return tamanno;
    }
	
	public void agregarAlFinal(String valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        
        if (esVacia()) {
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanno++;
    }
	
	public void agregarAlInicio(Jugador valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor.getNombre());
        
        if (esVacia()) {
            inicio = nuevo;
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanno++;
    }
    
    
    public void editarPorPosicion(int posicion , String valor){
        if(posicion>=0 && posicion<tamanno){
            if(posicion == 0){
                inicio.setValor(valor);
            }
            else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setValor(valor);
            }
        }
    }
    
    public void listar(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;

            while(aux != null){
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
    
    
}
