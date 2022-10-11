package com.arreglos.unidimensionales;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArreglosBasicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicito tamaño del arreglo (nro de temperaturas)
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese el nro de temperaturas:");
		int n = keyboard.nextInt();
		
		//Declaro el arreglo de temperaturas y la variable suma
		double[] temperaturas = new double[n];
		double suma = 0;

		//Ciclo para recorrer el arreglo de temperaturas y calculo de suma
		for(int i=0;i<temperaturas.length;i++) {
			System.out.println("Ingrese temperatura nro " +(i+1));
			temperaturas[i]=keyboard.nextDouble();
			suma = suma + temperaturas[i];
		}
		//Imprimo el promedio de temperaturas (suma/n)
		System.out.print("La temperatura promedio para " +n+" temperaturas es:\n"
				+ suma/n);
		






		/*
		int[] array = {1,2,3,4,5};

		for (int i=0; i<array.length; i++){
			array[i] = i*2;
		}
		System.out.println(Arrays.toString(array));

		for (int i : array){
			System.out.print(i + " ");
		}
		/*

		int[] arreglo = new int[10];
		for (int i = 0; i <arreglo.length; i++){
			arreglo[i] = 2 * i;
		}
		 */



	}

}
