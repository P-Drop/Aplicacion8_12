package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.model.*;

public class Controller {

	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Altura de la caja: ");
		int y = keyboard.nextInt();
		System.out.print("Ancho de la caja: ");
		int x = keyboard.nextInt();
		System.out.print("Profundidad de la caja: ");
		int z = keyboard.nextInt();
		System.out.print("Unidad de medida (cm/m): ");
		String unidad = keyboard.next();
		if(unidad.equals("cm")||unidad.equals("m")) {
		CajaCarton miCaja = new CajaCarton(x, y, z, Unidad.valueOf(unidad));
		System.out.print("Introduce la etiqueta (30 char): ");
		String e = keyboard.next();
		miCaja.setEtiqueta(e);
		System.out.println(miCaja.toString());
		}
		else {
			System.err.println("ERROR");
		}
		keyboard.close();
	}
}
