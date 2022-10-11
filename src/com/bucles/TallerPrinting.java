package com.bucles;

public class TallerPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	1	Imprimo 1 una vez
			22	
			333
			4444
			55555

		 */
		
		int numero = 1;
		int limite = 5;
		do {
			int columnas=1;
			while(columnas<=numero) {
				System.out.print(numero);
				columnas++;
			}
			System.out.println();
			numero++;
		}while(numero<=limite);
		
		
		System.out.println("==============================");
		
		/*
		 * 	
		 * 	1
			12
			123
			1234
			123
			12
        	1
		 */
		
		numero = 1;
		limite = 4;
		
		do {
			int columnas=1;
			while(columnas<=numero) {
				System.out.print(columnas);
				columnas++;
			}
			System.out.println();
			numero++;
		}while(numero<=limite);
		//Me devuelvo
		
		
		limite = 1;
		numero = 3;
		do {
			int columnas = 1;
			while(columnas<=numero) {
				System.out.print(columnas);
				columnas++;
			}
			System.out.println();
			numero--;
		}while(numero>=limite);
		
		
	}

}
