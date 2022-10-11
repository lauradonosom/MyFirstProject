package com.arreglos.bidimensionales;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = new int[10][10];

		//Proceso
		for (int i=0; i<intArray.length;i++) {
			//columnas
			for (int j=0; j<intArray[i].length;j++) {
				if(i==j) {
					intArray[i][j]=1;
				}
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

		String [] strArr = new String[10];
		String separador = " ";	
		for ( int i = 1; i <= strArr.length; i += 2) {
			System . out . print ( separador + strArr [ i ]) ;
			separador= " , " ;
		}


	}

}
