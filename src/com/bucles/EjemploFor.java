package com.bucles;

public class EjemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Error 1
		int sum = 0;
		for (int n = 1; n <= 10; n++) { //n puede ser utilizado solo dentro del for
			sum = sum + n * n;
		}
		//System.out.println(n);

		
		//Error2
		//1x2x3x4x5x6x7x8x9x10
		int producto = 1, numero;
		for (numero = 1; numero <= 10; numero++);//El ; me crea un ciclo vacio
		{
			producto = producto * numero;
		}
		System.out.println("El producto es: " + producto);
		
		
		

	}

}
