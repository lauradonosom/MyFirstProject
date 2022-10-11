package com.condicionales;

import javax.swing.JOptionPane;

public class EjercicioOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deudas, ahorros, ingresos;
		String inputDeuda = JOptionPane.showInputDialog("Ingrese deuda: ");
		deudas  = Integer.parseInt(inputDeuda);
		
		String inputAhorros = JOptionPane.showInputDialog("Ingrese ahorros: ");
		ahorros  = Integer.parseInt(inputAhorros);
		
		String inputIngresos = JOptionPane.showInputDialog("Ingrese ingresos: ");
		ingresos  = Integer.parseInt(inputIngresos);
		
		//preguntar si ahorros es mayor igual a deudas OR ingresos mayor o igual a deudas
		if( ahorros >= deudas || ingresos >= deudas) {
			JOptionPane.showMessageDialog(null, "Saldos OK");
			
		} else {
			JOptionPane.showMessageDialog(null, "Estas en bancarrota");
		}
	}

}
