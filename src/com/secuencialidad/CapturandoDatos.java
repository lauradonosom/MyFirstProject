package com.secuencialidad;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CapturandoDatos {

	//Metodo main
	public static void main(String[] args) {
		// Aqui empieza a ejecutarse mi codigo
		//Capturando datos con JOptionPane
		String name = JOptionPane.showInputDialog("Como te llamas?");
		JOptionPane.showMessageDialog(null, "Hola, " + name);

		//Capturando con Scanner
		//Creamos variable tipo Scanner y le decimos que pueda aceptarla como input 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese dos números enteros separados de uno o más espacios: ");

		//Declaro variables
		int n1, n2;

		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();

		System.out.println("Ha ingresado " + n1 + " y " + n2);

		System.out.println("Ahora ingrese dos palabras:");
		String s1, s2;
		//Lee una palabra
		s1 = keyboard.next();
		s2 = keyboard.next();


		System.out.println("Ha ingresado \"" +
				s1 + "\" y \"" + s2 + "\"");

		s1 = keyboard.nextLine();
		System.out.println("Ahora ingrese una línea de texto:");
		s1 = keyboard.nextLine();
		System.out.println("Ha ingresado: \"" + s1 + "\"");

	}

}
