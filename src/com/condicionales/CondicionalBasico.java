package com.condicionales;

import javax.swing.JOptionPane;

public class CondicionalBasico {

	public static void main(String[] args) {
		
		//IF sencillo
		int x = 3;
		int y = 5;// declaramos una variable tipo int llamada x y le asignamos el valor de 3
		//Preguntar si x es igual a 3
		if (x == 3) {
			if ( y == 6) {
				JOptionPane.showMessageDialog(null, "y es igual a 6");
				JOptionPane.showMessageDialog(null, "x es igual a 3");
			} 
		}  else {
			//Si x no es igual a 3
			JOptionPane.showMessageDialog(null, "x NO es igual a 3");
		}
		
		//Hacer algo independiente de la condicion
		JOptionPane.showMessageDialog(null, "Esto siempre se mostrará");
		
		
	}
}
