package com.parcial2;

import javax.swing.JOptionPane;

public class Punto3Explained {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Escriba un programa que me imprima números enteros de 1 a n 
		 *  (ingresado por el usuario) pero que me omita los números pares.
		 */
		
		//Pedir numero al usuario
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nro entero."));
		
		//Generar numeros enteros del 1 al n
		for(int i=1;i<=n;i++) {
			if(i%2==0){
				//saltar a la próxima iteración de un ciclo
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
