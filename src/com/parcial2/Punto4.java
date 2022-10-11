package com.parcial2;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Código original:
		 *  String [] strArr = new String[11];
			String separador = "";
			for ( int i = 1; i <= strArr.length; i += 2) {
			System . out . print ( separador + strArr [i]) ;
			separador= " , " ;
			}
		 */

		String [] strArr = new String[11];//dimension 11 (indices del 0 al 10)
		//null , null , null , null , null , null , null , null , null , null , null
		String separador = "";
		for ( int i = 0; i <= strArr.length; i+=2) {
			
			System.out.print( separador + strArr [i]) ;
			System.out.print(i+", ");
			separador= " , " ;
		}


	}

}
