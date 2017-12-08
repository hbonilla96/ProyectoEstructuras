package com.juego.estructuras;

public class PilaAtaques {
	   private Nodo inicio;
	   private int tamanio;
	   
	    public void Pila(){
	        inicio = null;
	        tamanio = 4;
	    }

	    public boolean esVacia(){
	        return inicio == null;
	    }
	    public int getTamanio(){
	        return tamanio;
	    }

	    public void apilar(String valor){
	    
	        Nodo nuevo = new Nodo();
	        nuevo.setValor(valor);
	      
	        if (esVacia()) {
	           
	            inicio = nuevo;
	        }
	        
	        else{
	            nuevo.setSiguiente(inicio);
	            inicio = nuevo;
	        }
	        tamanio++;
	    } 
	    public void retirar(){
	        if (!esVacia()) {
	            inicio = inicio.getSiguiente();
	            tamanio--;
	        }
	    }

	    public String cima() throws Exception{
	        if(!esVacia()){
	            return inicio.getValor();
	        } else {
	            throw new Exception("La pila se encuentra vacia.");
	        }
	    }
	    public boolean buscar(String referencia){
	  
	        Nodo aux = inicio;
	        boolean existe = false;
	        while(existe != true && aux != null){
	       
	            if (referencia == aux.getValor()) {
	          
	                existe = true;
	            }
	            else{
	                aux = aux.getSiguiente();
	            }
	        }
	        return existe;
	    }
	    
	    public void remover(String referencia){
	   
	        if (buscar(referencia)) {
	            Nodo pilaAux = null;
	
	            while(referencia != inicio.getValor()){ 
	                Nodo temp = new Nodo();
	                temp.setValor(inicio.getValor());
	                if(pilaAux == null){
	                    pilaAux = temp;
	                }
	                else{
	                    temp.setSiguiente(pilaAux);
	                    pilaAux = temp;
	                }
	                retirar();
	            }
	            retirar();
	            while(pilaAux != null){
	                apilar(pilaAux.getValor());
	                pilaAux = pilaAux.getSiguiente();
	            }
	            pilaAux = null;
	        }
	    }    
	    public void editar(String referencia, String valor){
	        if (buscar(referencia)) {
	            Nodo pilaAux = null;
	            while(referencia != inicio.getValor()){
	                Nodo temp = new Nodo();
	                temp.setValor(inicio.getValor());
	                if(pilaAux == null){
	                    pilaAux = temp;
	                }
	                else{
	                    temp.setSiguiente(pilaAux);
	                    pilaAux = temp;
	                }
	                retirar();
	            }
	            
	            inicio.setValor(valor);
	            while(pilaAux != null){
	          
	                apilar(pilaAux.getValor());
	               
	                pilaAux = pilaAux.getSiguiente();
	            }
	         
	            pilaAux = null;
	        }
	    }
	    public void eliminar(){
	        inicio = null;
	  	    tamanio = 0;
	    }

	    public void listar(){    
	        Nodo aux = inicio;
	        while(aux != null){
	            System.out.println("|\t" + aux.getValor() + "\t|");
	            System.out.println("-----------------");
	            aux = aux.getSiguiente();
	        }
	    }
}
