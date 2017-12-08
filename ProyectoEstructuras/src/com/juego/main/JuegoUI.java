package com.juego.main;

import java.io.BufferedReader;

import com.juego.clases.Guerrero;
import com.juego.logic.GestorJuego;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JuegoUI {
	private static final int contJugadores = 2;
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static GestorJuego handler = new GestorJuego();
	
	public static void main(String[] args) throws Exception {
		
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

	private static int leerOpcionDelMenu() throws Exception{
        return Integer.parseInt(br.readLine()); 
	}
	
	private static boolean ejecutarAccionDelMenu(int opcion)throws Exception {
		switch(opcion) {
		case 1:
			crearJugadores();	
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			handler.listarJugadores();
			break;
		case 5:
			return true;
		}
		return false;
	}
	
	private static void crearJugadores() throws Exception {
		for(int i=0;i<contJugadores;i++){
			System.out.println("Nombre del jugador");
			String nombre = br.readLine();
			handler.crearJugador(nombre);
			}
		}
	
	private static void listarGuerreros() {
		ArrayList<Guerrero> guerreros= GestorJuego.listarGuerreros();
		int tamanno = guerreros.size();
		for(int i = 0; i < tamanno; i++) {
			System.out.println(i + 1 + ": " + guerreros.get(i) + "\n");
		}
	}
	
	private static void seleccionarGuerrero() throws IOException {
		listarGuerreros();
		int guerrero1;
		int guerrero2;
		
		System.out.println("--JUGADOR 1--");
		System.out.println("Seleccione un guerrero: ");
		guerrero1 = Integer.parseInt(br.readLine());
		
		System.out.println("--JUGADOR 2--");
		System.out.println("Seleccione un guerrero: ");
		guerrero2 = Integer.parseInt(br.readLine());
	}
	
}
