package com.cursoceat.model;

public class Caja {
	
	private int alto;
	private int ancho;
	private int fondo;
	private Unidad unidad;
	private String etiqueta;
	
	public Caja(int ancho, int alto, int fondo, Unidad u) {
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.unidad = u;
		this.etiqueta = "NO ETIQUETA";
	}
	
	public double getVolumen() {
		double v = this.alto * this.ancho * this.fondo;
		return v;
	}
	
	public void setEtiqueta(String etiqueta) {
		this.etiqueta=etiqueta;
	}
	
	@Override
	public String toString() {
		String cadena = "\nCaja: "+this.etiqueta+"\nAncho: "+this.ancho+" "+this.unidad+"\nAlto: "+this.alto+" "+this.unidad+"\nFondo: "+this.fondo+" "+this.unidad+"\nVolumen: "+this.getVolumen()+" "+this.unidad+"³";
		return cadena;
	}
}
