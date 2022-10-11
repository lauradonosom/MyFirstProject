package com.secuencialidad;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		
		//Declarar dos variables tipo int y dos tipo double
		int x, y; //Declarar dos variables en la misma linea de codigo
		double n, m;
		
		//Solicitar variables a traves de JOptionPane
		String inputX = JOptionPane.showInputDialog("Ingrese x, debe ser entero");
		String inputY = JOptionPane.showInputDialog("Ingrese y, debe ser entero");
		
		
		//Parsear variables de String a int o double
		x = Integer.parseInt(inputX);
		y = Integer.parseInt(inputY);
		//n = Double.parseDouble(inputN);
		//m = Double.parseDouble(inputM);
		
		//Calcular modulo
		int intResiduo = x+=2;
		JOptionPane.showMessageDialog(null, "El residuo de " + x + " y " + y + " es: " + intResiduo);
		
		
		

	}

}
