package com.condicionales;

import java.util.Scanner;
/**
Programa que me calcula el area de un circulo.
Author: Pepito Perez.
E-mail Address: pepitoperez@gmail.com
Ultima modificacion: Agosto 30, 2022.
*/
public class CalculoCirculo{
	
	public static final double PI = 3.14159; //Constante PI
	public static void main(String[] args)
	{
		double radio; 
		double area; 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese el radio del círculo en cms:");
		
		radio = keyboard.nextDouble();
		area = PI * radio * radio;
		
		System.out.println("Un círculo de radio " + radio + " cms");
		System.out.println("tiene un áread de " + area + " cms2.");
	}
}