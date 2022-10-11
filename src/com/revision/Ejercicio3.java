package com.revision;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[] maiz = new int[20];
		int[] papa = new int[20];
		int[] yuca = new int[20];
		int maiz1 = 0;
		int papa1 =0;
		int yuca1 =0;

		boolean si = false;
		String confirmar = JOptionPane.showInputDialog("Usted ya ha cosechado, responda si o no");
		confirmar.toLowerCase();
		if (confirmar.equals("si")) {
			si = true;
		} else {
			JOptionPane.showMessageDialog(null, "Usted no cumple con los requerimientos para volver a cosechar");
		}
		if (si == true) {
			int a =Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion que desea:\n 1-Ver cuantas y cuales parcelas se sembraron con Maíz \n 2-Ver cuantas y cuales parcelas se sembraron con Papa \n 3-•\tVer cuantas y cuales parcelas se sembraron con Yuca \n 4-Volver a sembrar una parcela \n 5-Cosechar una parcela \n 6-salir"));

			switch (a) {
			case 1 -> {
				int contador1 = 0;
				for (int i = 0; i < maiz.length; i++) {
					maiz[i] = (int) (Math.random() * 20 + 1);
					maiz1 = maiz[i];
					System.out.println();  System.out.println("El  numero de las parcelas que se sembraron son : " + maiz1);
					contador1++;
				}

				System.out.println( " El total de parcelas cultivadas es: " + contador1);

				break;
			}

			case 2 -> {
				int contador2 = 0;
				for (int i = 0; i < papa.length; i++) {
					papa [i] = (int) (Math.random() * 20 + 1);
					papa1 = papa[i];
					System.out.println("El  numero de las parcelas que se sembraron son : " + papa1);
					contador2++;
				}

				System.out.println( " El total de parcelas cultivadas es: " + contador2);

				break;

			}
			case 3 -> {
				int contador1 = 0;
				for (int i = 0; i < yuca.length; i++) {
					
					yuca[i] = (int) (Math.random() * 20 + 1);
					yuca1 = yuca[i];
					System.out.println("El  numero de las parcelas que se sembraron son : " + yuca1);
					contador1++;
				}
				System.out.println( " El total de parcelas cultivadas es: " + contador1);
				break;

			}

			}
		}

	}

}
