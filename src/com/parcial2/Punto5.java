package com.parcial2;

import javax.swing.JOptionPane;

public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que me permita obtener el número de letras 
		 * que una palabra dada por el usuario contiene.
		 */

		//Pido palabra al usuario
		String frase = JOptionPane.showInputDialog("Ingrese una frase.");
		
		//Calcular el nro de letras de la palabra
		
		
		String fraseReplace = frase.replace(" ", "");
		
		//Calculo la dimension
		int numeroLetras = fraseReplace.length();

		JOptionPane.showMessageDialog(null, "La palabra " + frase + " contiene "+numeroLetras+" letras.");
		
		
	}

}
