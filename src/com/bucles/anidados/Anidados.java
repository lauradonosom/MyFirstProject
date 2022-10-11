package com.bucles.anidados;

public class Anidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Imprimiendo una fila
		for(int i=1;i<=10;i++){  
			System.out.print(i+" ");  
		} 
		System.out.println("\n--------------------------------");
				
		//Imprimiendo una columna
		for(int i=1;i<=10;i++){  
			System.out.println(i);  
		}  

		

		System.out.println("\n--------------------------------");

		for(int i=0;i<=4;i++){  

			for(int j=0;j<=i;j++){  
				System.out.print(i*2);  
			} 
			System.out.println();
		}
		System.out.println("\n--------------------------------");

		for(int i=4;i>=1;i--){  

			for(int j=1;j<=i;j++){  
				System.out.print(i);  
			} 
			System.out.println();
		}
		
		System.out.println("\n--------------------------------");
		
		/*
		 * 	1 
			2 3 
			4 5 6 
			7 8 9 10 
			11 12 13 14 15 
		 */
		
		for(int i=1,p=1;i<=4;i++){  

			for(int j=1;j<=i;j++){  
				System.out.print(p+" ");
				p++;
			} 
			System.out.println();
		}
		
		System.out.println("\n--------------------------------");
		
		for (int i = 0; i <=4 ; i++) {
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
