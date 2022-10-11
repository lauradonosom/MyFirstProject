package com.popQuiz;

import javax.swing.JOptionPane;

public class QuizArreglosExplained {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que llene un arreglo con 20 números enteros aleatorios 
		 * entre 1 y 40. Haga una búsqueda en el array para descubrir si contiene o no
		 * un entero que debe ser ingresado por el usuario, imprima el array al final.
		 * 1.Llenar arreglo con aleatorios entre 1 y 40
		 */
		
		int[] array = new int[20];
		
		int min = 1;
		int max = 40;
		
		int numero = 0;
		
		boolean existe = false;
		
		for(int i=0; i<array.length;i++) {
			array[i] = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
		}
		
		
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		
		
		do {
			//Solicitar numero
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 20"));
			for(int i=0; i<array.length;i++) {
				if(numero==array[i]) {
					existe=true;
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, "+numero+" no si existe en el array."
							+ "\nIntente de nuevo.");
					break;
				}
			}
		}while(!existe);
		
		
		if(existe) {
			JOptionPane.showMessageDialog(null, "Correcto, "+numero+" si existe en el array.");
		}

	}

}
