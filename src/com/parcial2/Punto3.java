package com.parcial2;

import javax.swing.JOptionPane;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicito variable
		int n = Integer.parseInt(JOptionPane.showInputDialog("Generador de números pares entre 1 y n.\n"
				+ "Por favor ingrese n, debe ser entero."));

		System.out.println("Los números son:");
		//Genero numeros
		for(int i=1; i<=n ;i++) {
			//Omito los pares
			if(i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
