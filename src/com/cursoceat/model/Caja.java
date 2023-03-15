package com.cursoceat.model;

public class Caja {
	
	protected int alto;
	protected int ancho;
	protected int fondo;
	protected Unidad unidad;
	protected String etiqueta;
	
	public Caja(int ancho, int alto, int fondo, Unidad u) {
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.unidad = u;
		this.etiqueta = "NO ETIQUETA";
	}
	
	public double getVolumen() {
		double v = this.alto * this.ancho * this.fondo;
		if (unidad == Unidad.CM) {
			v /= 1000000.0;
		}
		return v;
	}
	
	public void setEtiqueta(String etiqueta) {
		if(etiqueta.length()<30) {
		this.etiqueta=etiqueta;
		}
		else {
			this.etiqueta = etiqueta.substring(0, 29);
		}
	}
	
	@Override
	public String toString() {
		String cadena = "\nCaja: "+this.etiqueta+"\nAncho: "+this.ancho+" "+this.unidad+"\nAlto: "+this.alto+" "+this.unidad+"\nFondo: "+this.fondo+" "+this.unidad+"\nVolumen: "+this.getVolumen()+" m³";
		return cadena;
	}
}
