package com.juego.main;

import java.io.BufferedReader;

import com.juego.clases.CategoriaArma;
import com.juego.logic.GestorJuego;
import java.io.InputStreamReader;

public class JuegoUI {
	private static final int contJugadores = 2;
	private static final int contArmas = 4;
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
	private static void mostrarMenuArmas() {
		System.out.println("Armas");
        System.out.println("Puede elegir 4, sino se le asigna una por defecto");
        System.out.println("1. CanionPlasma");
        System.out.println("2. Bomba");
        System.out.println("3. Espada Gancho");
        System.out.println("5. Llave Espada");
        System.out.println("6. Salir.");
	}
	private static void elegirArmas()throws Exception {
	 int opcion,cont=1;
		while(cont<=contArmas) {
			mostrarMenuArmas();
			opcion = leerOpcionDelMenu();
			if(esOpcionValida(opcion)) {
				handler.elegirArmas(CategoriaArma.values()[opcion-1]);
				cont++;
			}else {
				System.out.println("Opcion invalida");
			}
		}
	}
	private static boolean esOpcionValida(int opcion) {
		return opcion > 0 && opcion < 5;
	}
	
}
