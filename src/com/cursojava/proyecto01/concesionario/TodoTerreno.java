package com.cursojava.proyecto01.concesionario;

public class TodoTerreno extends Automovil {
	
	protected String nombre;
	protected final int NUM_PUERTAS = 5;
	protected int numPuertas;
	protected double peso;

	public TodoTerreno(int numRuedas, String numPlaca, String nombre,
			int numCaballos, double peso) {
		super(numRuedas, numPlaca, numCaballos);
		this.nombre = nombre;
		this.numPuertas = NUM_PUERTAS;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "[Nombre de todo terreno = " + this.nombre +" Número de puertas = " + this.numPuertas + 
				", Número de caballos = " + this.numCaballos + 
				", peso = " + this.peso + " " + super.toString();
	}

}
