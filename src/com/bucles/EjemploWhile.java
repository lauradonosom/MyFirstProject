package com.bucles;

import javax.swing.JOptionPane;

public class EjemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimir numeros de 1 hasta contador
		int contador = 1;
		String inputNumero = JOptionPane.showInputDialog("Ingrese un número");
		int numero = Integer.parseInt(inputNumero);

		while (contador <= numero) {
		  System.out.print(contador + ", \r");
		  contador++;
		}
		
		System.exit(0);
	}

}
