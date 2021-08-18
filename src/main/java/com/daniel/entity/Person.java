package com.daniel.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="person")
public class Person{
	
	@Id
	@Column(name = "cedula")
	private Long cedula;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha_nacimiento")
	private String fechaNacimiento;
	@Column(name = "numero_telefono")
	private String numeroTelefonico;
	@Column(name = "email")
	private String email;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "ciudad")
	private String ciudadResidencia;
	@Column(name = "profesion")
	private String profesion;
	@Column(name = "trabajo_actual")
	private String trabajoActual;
	@Column(name = "ingresos")
	private String ingresos;
	@Column(name = "egresos")
	private String egresos;
	
	@OneToOne
	@JoinColumn(name = "id_tarjeta")
	private Count count;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}	
	

	public Person(Long cedula, String nombre, String fechaNacimiento, String numeroTelefonico, String email,
			String direccion, String ciudadResidencia, String profesion, String trabajoActual, String ingresos,
			String egresos, Count count) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
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


	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
