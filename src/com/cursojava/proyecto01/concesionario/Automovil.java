package com.cursojava.proyecto01.concesionario;

import com.cursojava.interfaz.GestionConcesionario;

/**
 * Clase automovil para una proyexto de cuantos automoviles estan en el parking diferenciado por coche y moto.
 * dentro de coche estarán los desportivos y no deportivos.
 * */
public abstract class Automovil implements GestionConcesionario{
	
	protected static int NUM_AUTOMOVILES = 0;
	protected final int  idConcesionario = 119;
	protected int numRuedas; 
	protected String numPlaca;
	protected int numCaballos;
	
	/**
	 * Constructor de la clase automovil
	 * */
	public Automovil(int numRuedas, String numPlaca, int numCaballos) {
		super();
		this.numRuedas = numRuedas;
		this.numPlaca = numPlaca;
		this.numCaballos = numCaballos;
		NUM_AUTOMOVILES++;
	}

	@Override
	public String toString() {
		return "Número de ruedas = " + this.numRuedas + 
				", Número de placa = " + this.numPlaca + 
				", Número de caballos = " + this.numCaballos + "]";
	}

	protected int getNumRuedas() {
		return numRuedas;
	}

	protected String getNumPalaca() {
		return numPlaca;
	}

	@Override
	public void cocheVendido() {
		NUM_AUTOMOVILES--;
		
	}

	public int getNumAutomoviles() {
		return NUM_AUTOMOVILES;
	}
	
}
