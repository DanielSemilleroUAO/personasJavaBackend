package com.daniel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
	
	private String nombre;
	private String cedula;
	private String fechaNacimiento;
	private String numeroTelefonico;
	private String email;
	private String direccion;
	private String ciudadResidencia;
	private String profesion;
	private String trabajoActual;
	private String ingresos;
	private String egresos;
	private Count count;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String nombre, String cedula, String fechaNacimiento, String numeroTelefonico, String email,
			String direccion, String ciudadResidencia, String profesion, String trabajoActual, String ingresos,
			String egresos, Count count) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroTelefonico = numeroTelefonico;
		this.email = email;
		this.direccion = direccion;
		this.ciudadResidencia = ciudadResidencia;
		this.profesion = profesion;
		this.trabajoActual = trabajoActual;
		this.ingresos = ingresos;
		this.egresos = egresos;
		this.count = count;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getTrabajoActual() {
		return trabajoActual;
	}

	public void setTrabajoActual(String trabajoActual) {
		this.trabajoActual = trabajoActual;
	}

	public String getIngresos() {
		return ingresos;
	}

	public void setIngresos(String ingresos) {
		this.ingresos = ingresos;
	}

	public String getEgresos() {
		return egresos;
	}

	public void setEgresos(String egresos) {
		this.egresos = egresos;
	}

	public Count getCount() {
		return count;
	}

	public void setCount(Count count) {
		this.count = count;
	}
	
	
	
	
	
}
