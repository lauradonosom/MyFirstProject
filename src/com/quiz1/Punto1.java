package com.quiz1;

import javax.swing.JOptionPane;

public class Punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Preguntar al usuario una pregunta de si o no
		//2. Capturar respuesta en un String
		
		boolean aceptar=false; //solo tienen dos valores, true y false, se inicializa con false
		String respuesta;
		
		do {
			respuesta = JOptionPane.showInputDialog("Tienes hambre?\n+"
					+ "Escriba Salir si no desea responder");
				switch (respuesta.toLowerCase()) { //convierto el String en minuscula
				case "si":
					aceptar = true;
				break;
				case "s":
					aceptar = true;
				break;
				case "no":
					aceptar = false;
				break;
				case "n":
					aceptar = false;
				break;
			}
		}while(!respuesta.toLowerCase().equals("no") || !respuesta.toLowerCase().equals("n"));
		
		//comparar utilizando switch
		
		
		if(aceptar) {
			JOptionPane.showMessageDialog(null, "Ha respondido Si, es " + aceptar);
		} else {
			JOptionPane.showMessageDialog(null, "No ha respondido Si, es " + aceptar);
		}
		

	}

}
