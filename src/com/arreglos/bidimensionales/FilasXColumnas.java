package com.arreglos.bidimensionales;

public class FilasXColumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = new int[5][5];
		
		
		//Proceso
		for (int i=0; i<intArray.length;i++) {
			//columnas
			for (int j=0; j<intArray[i].length;j++) {
				intArray[i][j]=j*i;
			}
			
		}
		
		
		//Imprimo
		for (int i=0; i<intArray.length;i++) {
			//columnas
			for (int j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
