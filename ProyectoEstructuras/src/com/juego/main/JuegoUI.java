package com.juego.main;

import java.io.BufferedReader;
import java.io.DataInputStream;

import com.juego.estructuras.*;
import com.juego.logic.Gestor;

import java.io.IOException;

public class JuegoUI {

	private static DataInputStream in = new DataInputStream(System.in); 
	private static Gestor handler;
	
	public static void main(String[] args) throws IOException {
		
		int opcion = 0;
        boolean salir = true;

        do {
            mostrarMenu();
            opcion = leerOpcionDelMenu();
            salir = ejecutarAccionDelMenu(opcion);
        } while (salir == false);
	}

	private static void mostrarMenu() {
		System.out.println("Bienvendo a su juego Javamon");
        System.out.println("1.Crear jugador");
        System.out.println("2.Iniciar partida");
        System.out.println("3.Ver historial");
        System.out.println("4.Ver jugadores");
        System.out.println("5.Salir");
        System.out.println("");
	}

	private static int leerOpcionDelMenu() throws IOException{
        return Integer.parseInt(in.readLine()); 
	}
	
	private static boolean ejecutarAccionDelMenu(int opcion)throws IOException {
		switch(opcion) {
		case 1:
			crearJugador();	
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			return true;
		}
		return false;
	}
	
	private static void crearJugador() throws IOException {
		String nombre;
		System.out.println("Nombre del jugador");
		nombre = in.readLine();
		if(nombre!=null) {
		handler.crearJugador(nombre);
		}else {
			System.out.println("Pal doggy");
		}
	}

}
