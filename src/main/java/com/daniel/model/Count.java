package com.daniel.model;

public class Count {
	
	private String number;
	private String clave;
	private boolean state;
	private double saldo;
	
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
