package com.cursojava.proyecto01.concesionario;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ArrayList<Automovil> listaTodoTerreno = new ArrayList<>();
		ArrayList<Automovil> listaMoto = new ArrayList<>();
		
		listaTodoTerreno = CrearAutomoviles.crearListaTodoTerreno();
		System.out.println("lista coches todo terreno");
		for (Automovil automovil : listaTodoTerreno) {
			System.out.println(automovil.toString());
		}
		System.out.println("lista motos");
		listaMoto = CrearAutomoviles.crerListaMoto();
		for (Automovil automovil : listaMoto) {
			System.out.println(automovil.toString());
		}
		
		
	}

}
