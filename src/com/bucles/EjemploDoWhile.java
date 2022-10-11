package com.bucles;

import javax.swing.JOptionPane;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1;
		String inputNumero = JOptionPane.showInputDialog("Ingrese un número");
		int numero = Integer.parseInt(inputNumero);

		do {
			System.out.print(contador + ", ");
			contador++;

		} while (contador <= numero);
		
		System.exit(0);
	}

}
