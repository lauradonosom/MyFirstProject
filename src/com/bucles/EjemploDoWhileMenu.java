package com.bucles;

import javax.swing.JOptionPane;

public class EjemploDoWhileMenu {

	public static void main(String[] args) {
		// Crear un menu que se repita hasta que se seleccione la opción salir
		String menu="1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:
				JOptionPane.showMessageDialog(null, "Sumando ...");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Restando ...");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Multiplicando...");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Dividiendo ...");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Gracias por calcular con nosotros, adiós!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error, ingrese una opción válida!");
				break;
			}
		}while(opcion!=5);
		
	}

}
