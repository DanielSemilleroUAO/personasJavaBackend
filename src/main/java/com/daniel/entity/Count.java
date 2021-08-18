package com.daniel.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="count")
public class Count {
	
	@Id
	@Column(name = "id_tarjeta")
	private Long idTarjeta;
	@Column(name = "number")
	private String number;
	@Column(name = "clave")
	private String clave;
	@Column(name = "state")
	private boolean state;
	@Column(name = "saldo")
	private double saldo;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tarjeta")
	private Count count;
	
	public Count() {
		// TODO Auto-generated constructor stub
	}
	
	public Count(String number, String clave, boolean state, double saldo) {
		super();
		this.number = number;
		this.clave = clave;
		this.state = state;
		this.saldo = saldo;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
