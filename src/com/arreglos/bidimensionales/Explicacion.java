package com.arreglos.bidimensionales;

public class Explicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = {{1,3,5},
							 {2,7,4},
							 {3,10,2,4},
							 {0,8,3}};
		
		System.out.println("Nro filas: "+intArray.length);
		System.out.println("Nro columnas: "+intArray[2].length);
		
		System.out.println("-----------------");
		
		
		//filas
		for (int i=0; i<intArray.length;i++) {
			//columnas
			for (int j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Calculo Sumas");
		
		
		int[] acumuladorSuma=new int[intArray.length];
		//filas
		for (int i=0; i<intArray.length;i++) {
			//columnas
			for (int j=0; j<intArray[i].length;j++) {
				acumuladorSuma[j] =  acumuladorSuma[j] + intArray[i][j];
			}
		}
		
		for (int i=0; i<intArray.length;i++) {
			//columnas
			System.out.print(acumuladorSuma[i]+" ");
		}
		
		
        
		
		
		
		
		
		
	}

}
