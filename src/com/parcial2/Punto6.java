package com.parcial2;

import javax.swing.JOptionPane;

public class Punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Distribuir las 3 semillas de manera aleatoria en sus 20 parcelas.
		 * 2. Ver cuantas y cuales parcelas se sembraron con Maíz 
		   3. Ver cuantas y cuales parcelas se sembraron con Papa
		   4. Ver cuantas y cuales parcelas se sembraron con Yuca
	 	   5.Volver a sembrar una parcela
		   6.Cosechar una parcela
		 */

		/*
		 * Distribucion de semillas
		 * 1. Maiz, 2. Papa, 3. Yuca
		 * 
		 * Sembrar = Distribuir las semillas de manera aleatoria
		 * Cosechar = Recoger la siembra
		 * No se puede volver a sembrar si no se ha cosechado. Y no se puede cosechar si no se ha sembrado.
		 */

		//Declaracion de variables
		int[] parcelas = new int[20];
		int min = 1;
		int max = 3;

		int contadorMaiz=0;
		int contadorPapa=0;
		int contadorYuca=0;

		String separador = "";

		JOptionPane.showMessageDialog(null, "Buen día Don Jaime!\nDistribuyendo maíz, papa y yuca en sus parcelas.\nUn momento...");

		//Llenar un arreglo de dimension 20 con numeros aleatorios entre 1 y 3
		for(int i=0; i<parcelas.length;i++) {
			parcelas[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
		}

		//Imprimir parcelas
		for(int i=0; i<parcelas.length;i++) {
			System.out.print(parcelas[i]+" ");
		}

		//Crear menu
		String menu="1. Ver cuantas y cuales parcelas se sembraron con Maíz.\n"
				+ "2. Ver cuantas y cuales parcelas se sembraron con Papa.\n"
				+ "3. Ver cuantas y cuales parcelas se sembraron con Yuca.\n"
				+ "4. Volver a sembrar una parcela.\n"
				+ "5. Cosechar una parcela.\n"
				+ "6. Salir";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:
				separador = "";
				String posicionMaiz = "";
				//Verificar cuantas parcelas se sembraron con maiz(1)
				for(int i=0; i<parcelas.length;i++) {
					if(parcelas[i]==1) {
						posicionMaiz = posicionMaiz + separador + i;
						separador = ", ";
						contadorMaiz++; 
					}
				}
				JOptionPane.showMessageDialog(null, "Hay " + contadorMaiz + " semillas de Maíz en las posiciones " + posicionMaiz);				

				break;
			case 2:
				separador = "";
				String posicionPapa = "";
				//Verificar cuantas parcelas se sembraron con papa(2)
				for(int i=0; i<parcelas.length;i++) {
					if(parcelas[i]==2) {
						posicionPapa = posicionPapa + separador + i;
						separador = ", ";
						contadorPapa++;
					}
				}
				JOptionPane.showMessageDialog(null, "Hay " + contadorPapa + " semillas de Papa en las posiciones " + posicionPapa);	
				break;
			case 3:
				separador = "";
				String posicionYuca = "";
				//Verificar cuantas parcelas se sembraron con yuca(3)
				for(int i=0; i<parcelas.length;i++) {
					if(parcelas[i]==3) {
						posicionYuca = posicionYuca + separador + i;
						separador = ", ";
						contadorYuca++;
					}
				}
				JOptionPane.showMessageDialog(null, "Hay " + contadorYuca + " semillas de Yuca en las posiciones " + posicionYuca);	
				break;
			case 4:
				/*
				 * Volver a sembrar
				 * No se puede volver a sembrar si no se ha cosechado. Y no se puede cosechar si no se ha sembrado.
				 */

				int parcelaPosicion =0;

				//Solicito el nro de la parcela que se desea sembrar de nuevo, valido que sea entre 1 y 20
				do {
					
					parcelaPosicion = Integer.parseInt(JOptionPane.showInputDialog(
							"En que parcela desea sembrar? (numero entre 1 y 20)"));

				}while (parcelaPosicion < 1 || parcelaPosicion > 20);

				int semilla = 0;
				parcelaPosicion--;
				
				//Valido que la parcela haya sido cosechada, de ser asi solicito que tipo de semilla se quiere sembrar
				if (parcelas[parcelaPosicion] == 0) {
					do {
						semilla = Integer.parseInt(JOptionPane.showInputDialog("Que quiere sembrar? 1. Maiz 2.Papa 3. Yuca"));
						switch(semilla) {
							case 1:
								parcelas[parcelaPosicion]=semilla;
								break;
							case 2:
								parcelas[parcelaPosicion]=semilla;
								break;
							case 3:
								parcelas[parcelaPosicion]=semilla;
								break;
							default:
								JOptionPane.showMessageDialog(null, "Error, ingrese una opción válida.");
						}
					}while(semilla<1 || semilla>3);
				} else {
					JOptionPane.showMessageDialog(null, "Lo siento, esa parcela se encuentra sembrada. Cosechela primero.");
				}

				//Imprimir parcelas
				System.out.println("\n-----------------------------------------");
				for(int i=0; i<parcelas.length;i++) {
					System.out.print(parcelas[i]+" ");
				}
				break;
			case 5:
				//Cosechar

				parcelaPosicion =0;

				//Solicito el nro de la parcela que se desea cosechar de nuevo valido que sea entre 1 y 20
				do {
					parcelaPosicion = Integer.parseInt(JOptionPane.showInputDialog(
							"En que parcela desea cosechar? (numero entre 1 y 20)"));

				}while (parcelaPosicion < 1 || parcelaPosicion > 20);
				
				parcelaPosicion--;
				JOptionPane.showMessageDialog(null, "Parcela "+parcelaPosicion+ " cosechada!");
				parcelas[parcelaPosicion]=0;
				
				//Imprimir parcelas
				System.out.println("\n-----------------------------------------");
				for(int i=0; i<parcelas.length;i++) {
					System.out.print(parcelas[i]+" ");
				}
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error, ingrese una opción válida.");
				break;
			}
		}while(opcion!=6);

	}

}
