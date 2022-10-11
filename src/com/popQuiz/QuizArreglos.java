package com.popQuiz;

import javax.swing.JOptionPane;

public class QuizArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que llene un arreglo con 20 números enteros aleatorios entre 1 y 40. 
		 * Haga una búsqueda en el array para descubrir si contiene o no un entero que debe ser ingresado por el usuario, imprima el array al final. 

		   Bono: Repita el programa tantas veces como sea necesario hasta que el usuario ingrese un número que se encuentre en el array.
		 */

		int[] array = new int[20];
		int min = 1;
		int max = 40;
		boolean existe = false;
		
		//Genero aleatorios y los agrego al array
		for(int i=0; i<array.length;i++) {
			array[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
		}
		
		//Imprimir
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		do {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Intente adivinar un número que se encuentra dentro del arreglo.\n"
					+ "Sólo números enteros entre 1 y 40."));
			//Verifico si el nro existe
			for(int i=0; i<array.length;i++) {
				if(numero==array[i]) {
					existe = true;
					break;
				} 
			}
			
			if(existe) {
				JOptionPane.showMessageDialog(null, "Muy bien! " + numero + " se encuentra en el arreglo.");
			} else {
				JOptionPane.showMessageDialog(null, "Mala suerte! " + numero + " no se encuentra en el arreglo. Vuelva a intentarlo");
			}
			
		}while(!existe);
		
	}

}
