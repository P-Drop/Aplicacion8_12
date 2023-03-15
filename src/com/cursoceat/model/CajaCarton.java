package com.cursoceat.model;

public class CajaCarton extends Caja{

	public CajaCarton(int ancho, int alto, int fondo, Unidad u) {
		super(ancho, alto, fondo, u);
		// TODO Auto-generated constructor stub
		if(u == Unidad.M) {
			System.err.println("Estas cajas solo admiten medidas en cm");
			super.alto *= 100; 
			super.ancho *= 100; 
			super.fondo *= 100; 
		}
		super.unidad = Unidad.CM;
		
	}
	@Override
	public double getVolumen() {
		double v = super.getVolumen()*0.8;
		return v;
	}
	public double getSuperficie() {
		double s = ((super.alto*super.ancho)*4 + (super.ancho*super.fondo)*2)/10000.0;
		return s;
	}
	@Override
	public String toString() {
		String cadena = "\nCaja: "+super.etiqueta+"\nAncho: "+super.ancho+" "+this.unidad+"\nAlto: "+this.alto+" "+this.unidad+"\nFondo: "+this.fondo+" "+this.unidad+"\nVolumen: "+this.getVolumen()+" m³\nSuperficie: "+this.getSuperficie()+" m²";
		return cadena;
	}
}
