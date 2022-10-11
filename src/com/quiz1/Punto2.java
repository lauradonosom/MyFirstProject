package com.quiz1;

import javax.swing.JOptionPane;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pedir tipo temperatura en C,c,F,f
		 * Pedir valor temperatura
		 * Validar que tipo de unidad ingresó
		 * Hacer la conversión
		 * Imprimir resultados
		 * Grados_C = 5(Grados_F –32)/9
		 * Grados_F = (9(Grados_C/5)+ 32)
		 */
		
		
		String tipoTemperatura = JOptionPane.showInputDialog("Ingrese la unidad\n"
				+ "Celsius (C, c)\n"
				+ "Fahrenheit (F, f)\n");
		String inputTemperatura = JOptionPane.showInputDialog("Ingrese el valor de la temperatura");
		double temperatura = Double.parseDouble(inputTemperatura);
		double conversion=0.0; //Inicializar variable
		
		//Si ingresó Celsius
		if(tipoTemperatura.equals("C") || tipoTemperatura.equals("c")) {
			conversion = (9*(temperatura/5)+ 32);//Hacer uso de parentesis para operaciones multiples
		} else if (tipoTemperatura.equals("F") || tipoTemperatura.equals("f")) {
			conversion = (5*(temperatura - 32)/ 9);
		}
		
		//Imprimir resultados
		JOptionPane.showMessageDialog(null, "La temperatura " + temperatura + " en " + tipoTemperatura +
				" es igual a " + conversion );

	}

}
