package com.bucles;

public class WhileAFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En estructura while
		/*int i = 5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("Feliz Año!");
		*/
		
		//En estructura for
		for(int i = 5; i>0; i--) {
			System.out.println(i);
		}
		System.out.println("Feliz Año!");
		//Primero imprimir Feliz año, y luego contar del 1 al 5
		
		System.out.println("Feliz Año!");
		for(int j=1;j<=5;j++) {
			System.out.println(j);
		}
		
		System.out.println("------------------------");
		for(int j=1;j<=5;j++) {
			System.out.println(j);
			if(j==3) {
				break;//Interrumpir un ciclo dada una condicion
			}
			
		}
		
		
	}

}



