package com.co.dtos;

public class Persona {
	private String cedula;
	private int edad;
	private Direccion direccion;
	
	
	
	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public Direccion getDireccion() {
		return direccion;
	}



	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}



	public Persona(String cedula, int edad, Direccion direccion) {
		super();
		this.cedula = cedula;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	

}
