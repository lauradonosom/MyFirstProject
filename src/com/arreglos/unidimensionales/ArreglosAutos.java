package com.arreglos.unidimensionales;

import java.util.Arrays;

public class ArreglosAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars = {"Mazda","Volvo","BMW","Audi"};
		System.out.println("Tamaño: "+cars.length);

		int[] modelo = {2002,2005,2018,2020};

		System.out.println(Arrays.toString(cars));

		//Cambiar el valor de un elemento de un arreglo
		System.out.println(cars[0]);
		cars[3] = "Renault";
		System.out.println(cars[3]);

		//For each para recorrer arreglos
		for(int valor : modelo) {
			System.out.print(valor+", ");
		}
		
		System.out.println();

		
		int[] array = new int[5];
		for (int i = 0; i <array.length; i++){
			System.out.print(array[i]+" ");
		}





	}

}
