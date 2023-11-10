package com.cursojava.proyecto01.concesionario;

public class Deportivo extends Automovil{
	
	protected String equipo;

	public Deportivo(int numRuedas, String numPlaca, int numCaballos, String equipo) {
		super(numRuedas, numPlaca, numCaballos);
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Deportivo [equipo=" + equipo + super.toString() +"]";
	}

	

}
