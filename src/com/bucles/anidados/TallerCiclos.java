package com.bucles.anidados;

import javax.swing.JOptionPane;

public class TallerCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	1	Imprimo 1 una vez
			22	
			333
			4444
			55555

		 */
		/*
		int i = 1;
		String input = JOptionPane.showInputDialog("Cuantas lineas desea imprimir?");
		int n = Integer.parseInt(input);


		i=n;
		do {
			int j =5;//2
			do {
				System.out.print(j);
				j--;
			}while(j<=i);

			System.out.println();
			i++;
		}while(i<=n);
		 */

		String input = JOptionPane.showInputDialog("Cuantas lineas desea imprimir?");
		int n = Integer.parseInt(input);

		for (int i = n; i >=0 ; i--) {
			//manejo de columnas
			for (int j = 0; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println("---------------------");


		//n=5 0-5 
		for (int i = 0; i <=n*2 ; i++) {
			//manejo de columnas
			for (int j = 0; j <=i; j++) {
				if(i%2==0) {
					System.out.print(i+" ");
					j++;
				}

			}
			if(i%2==0) {
				System.out.println();
			}
		}
		
		System.out.println("---------------------");


		for (int i=0, p=0; i<=n ; i++,p+=2) {
			//manejo de columnas
			for (int j = 0; j <=i; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}

		System.out.println("---------------------");
		int p=1;
		for (int i = 0; i <=n ; i++) {
			//manejo de columnas
			for (int j = 0; j <=i; j++) {
				if(i%2==0) {
					System.out.print("2 ");
				}else {
					System.out.print("1 ");
				}
				
			}
			System.out.println();
		}

	}

}
