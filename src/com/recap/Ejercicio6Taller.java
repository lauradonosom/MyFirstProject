package com.recap;

import java.util.Scanner;
public class Ejercicio6Taller
{
	public static void main(String[] args)
	{
		/*
		 * Escriba un programa que lea 10 valores de tipo doble desde el teclado en un arreglo.
		 * Imprima el último (10) número leído. Luego muestre los números en el arreglo y cuánto
		 * difiere cada número del décimo número leído.
		 */
		
		//Sintaxis 
		//Tipo_de_variable[ ] Nombre_del_array = new Tipo_de_variable[dimensión];
		Scanner keyboard = new Scanner(System.in);
		double[] numeros = new double[10];
		
		
		System.out.println("Ingrese 10 números");

		
		for (int i=0; i<numeros.length; i++) {// i = 0
			System.out.println("Ingrese el número "+(i+1)); //ingrese el nro 1
			numeros[i] = keyboard.nextDouble(); //numeros[0] = 10
		}
		
		System.out.println("El último número es: " + numeros[9]);
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Numero  "+(i+1) +": "+numeros[i] + " difiere de "+numeros[9]+ " en " +(numeros[9]-numeros[i]));
		}

	}
}
