package com.condicionales;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OperadoresLogicos {
	
	public static final int HEART_RATE_MIN = 100;
	public static final int HEART_RATE_MAX = 170;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JPanel panel = new JPanel();
		
		//Uso de AND
		String inputPulsaciones =  JOptionPane.showInputDialog("Ingrese el nro de pulsaciones:");
		int pulsaciones = Integer.parseInt(inputPulsaciones);
		
		if((pulsaciones > HEART_RATE_MIN) && ( pulsaciones < HEART_RATE_MAX)) {
			JOptionPane.showMessageDialog(null, "Las pulsaciones por min están OK.");
		} else {
			JOptionPane.showMessageDialog(panel,
				    "Alerta, las pulsaciones por minuto sobrepasan el rango",
				    "Alerta",
				    JOptionPane.WARNING_MESSAGE);
		}
		
		//Uso de OR
		String inputSalario =  JOptionPane.showInputDialog("Ingrese su salario");
		String inputAhorros =  JOptionPane.showInputDialog("Ingrese sus ahorros");
		String inputGastos =  JOptionPane.showInputDialog("Ingrese sus gastos");
		
		int salario = Integer.parseInt(inputSalario);
		int gastos = Integer.parseInt(inputGastos);
		int ahorros = Integer.parseInt(inputAhorros);
		if ((salario > gastos) || (ahorros > gastos)) {
			System.out.println("Solvente");
		} else {
			System.out.println("En bancarrota");
		}
	}

}
