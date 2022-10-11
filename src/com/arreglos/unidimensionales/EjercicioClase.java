package com.arreglos.unidimensionales;

public class EjercicioClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9};
		for ( int i = 1; i <= 8; i += 2) {
			System . out . print ( intArr [ i ] + " , " ) ;
		}

		String [] strArr = new String [5];
		String sep = " " ;
		for ( int i = 0; i < strArr . length ; i ++) {
			System . out . print ( sep + strArr [ i ]) ;
			sep = " , " ;
		}
	}

}
