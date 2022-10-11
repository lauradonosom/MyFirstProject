package com.recap;

import javax.swing.JOptionPane;

public class EjercicioTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Si una barra metálica pequeña, cuya temperatura inicial es de 20 °C, 
		 * se deja caer en un recipiente de agua hirviente. 
		 * Realice un programa para saber el tiempo (minutos) que se tardará en alcanzar n°C 
		 * si se sabe que su temperatura aumenta en 2°C en un segundo.
		 */
		
		double temperaturaInicial = 20.0;
		double temperaturaActual = temperaturaInicial;
		double tasaAumento = 2.0;
		double contadorTiempo = 0; //segundos
		double temperaturaDeseada = Double.parseDouble(JOptionPane.showInputDialog("Qué temperatura desea alcanzar?"));
		
		//Se que cada minuto, la temperatura va a aumentar 2
		
		
		while(temperaturaActual<=temperaturaDeseada) {
			System.out.println("Temperatura actual "+temperaturaActual);
			System.out.println("Contador tiempo "+contadorTiempo);
			temperaturaActual+=tasaAumento;
			contadorTiempo++; //aumento 2C cada segundo
		}
		
		//Que debería mostrar?
		JOptionPane.showMessageDialog(null, "Para que la barra llegue a "+temperaturaDeseada+"C "
				+ "deben pasar " + (contadorTiempo/60)+" minutos");
		

		
	}

}
