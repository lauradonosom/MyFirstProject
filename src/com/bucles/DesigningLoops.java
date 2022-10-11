package com.bucles;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class DesigningLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1.	Imprimir las instrucciones al usuario
		 2.	Inicializar las variables producto y numero
		 3.	Repetir las siguientes acciones 5 veces
		 {
			Solicitar un numero y almacenarlo en la variable numero 
			producto = producto + numero
			Imprimir numero y producto
		 }
		 */
		JOptionPane.showMessageDialog(null, "Por favor ingrese 5 numeros enteros, estos serán productodos entre sí\n"
				+ " y usted podrá ver el resultado");
		int producto = 1, numero;
		String input;

		for (int i = 1; i <=5 ; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+i));
			producto = producto * numero;
			System.out.println("Numero: " + numero + "\tProducto: " + producto);
		}


	}

}
