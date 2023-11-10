package com.cursojava.proyecto01.concesionario;

public class Moto extends Automovil{
	
	protected String nombre;
	protected double peso;
	
	public Moto(int numRuedas, String numPlaca, String nombre, int numCaballos, double peso) {
		super(numRuedas, numPlaca, numCaballos);
		this.nombre = nombre;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nombre de Moto" + nombre + 
				", peso de moto = " + peso + " " + super.toString();
	}
	
	
	
	
	
	
	

}
