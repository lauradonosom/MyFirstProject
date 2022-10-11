package com.string;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);  
		System.out.println( helloString );
		
		String saludo, frase;
		saludo = "Hola";
		frase = saludo + "mi amigo";
		System.out.println(frase);
		
		String solucion = "La respuesta es " + (5+42);
		System.out.println(solucion);
		
		int n = "Hola".length( );
		System.out.println(n);
		
		
		String comando = "Sit Fido!";
		String respuesta = "barf-barf";
		
		int count = comando.length( );
		System.out.println("La dimensión es " + comando.length( ));
		count = comando.length( ) + 3;
		System.out.println(count);
	}
	

}
