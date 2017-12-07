package com.juego.main;

import java.io.BufferedReader;
import com.juego.estructuras.*;
import java.io.IOException;

public class JuegoUI {

	public static void main(String[] args) throws IOException {
		System.out.println("Bienvendo a su juego Javamon");
		menuPrincipal();

	}

	private static void menuPrincipal() throws IOException {
		int opcion = 0;
        boolean salir = true;

        do {
            mostrarMenu();
            opcion = leerOpcionDelMenu();
            salir = ejecutarAccionDelMenu(opcion);
        } while (salir == false);
	}

	private static void mostrarMenu() {
		System.out.println("");
        System.out.println("1.Crear jugador");
        System.out.println("2.Iniciar partida");
        System.out.println("3.Ver historial");
        System.out.println("4.Ver jugadores");
        System.out.println("5.Salir");
        System.out.println("");
	}

	private static int leerOpcionDelMenu() throws IOException{
		int opcion = 0;
        System.out.println("Ingrese una opcion");
        opcion = Integer.parseInt(in.readLine()); 
        return opcion;
	}
	
	private static boolean ejecutarAccionDelMenu(int opcion) {
		// TODO Auto-generated method stub
		return false;
	}
}
