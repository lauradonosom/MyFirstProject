package com.recap;


import javax.swing.JOptionPane;

public class EjemploSimplificar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Capturando datos con JOptionPane
		
		int tiempoDeseado = 0;
		
		
		tiempoDeseado = Integer.parseInt(JOptionPane.showInputDialog("Cuanto tiempo desea (segundos)"));
		JOptionPane.showMessageDialog(null, "Calentando alimento en "+tiempoDeseado);
		
		//10, 0, --
		for(int i=tiempoDeseado;i>=0;i--) {
			
			System.out.println("Tiempo actual:"+i);
		}
		
		JOptionPane.showMessageDialog(null, "LISTO!");
		

	}

}
