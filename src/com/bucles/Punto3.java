package com.bucles;

import javax.swing.JOptionPane;

public class Punto3 {

	public static void main(String[] args) {
		String input;
		int numero;
		do
		{
			input = JOptionPane.showInputDialog("Ingrese un número entero mayor a cero");
					numero = Integer.parseInt(input);
					System.out.println("Usted ha ingresado " + numero);
		} while (numero > 0);
		System.out.println("Numero despues del ciclo = " + numero);
	}

}
