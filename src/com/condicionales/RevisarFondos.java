package com.condicionales;

import java.util.Scanner;
/**
Programa que me revisa los fondos de una cuenta.
Author: Pepito Perez.
E-mail Address: pepitoperez@gmail.com
Ultima modificacion: Agosto 30, 2022.
 */
public class RevisarFondos
{
	public static final double PENALIDAD_SOBREGIRO = 80000; //Penalidad por sobregirar
	public static final double TASA_INTERES = 0.02; //2% anual

	public static void main(String[] args)
	{
		double balance;
		System.out.print("Ingrese el saldo de su cuenta: $");
		Scanner keyboard = new Scanner(System.in);

		balance = keyboard.nextDouble();

		System.out.println("Saldo original $" + balance);
		if (balance >= 0)
		{
			if (TASA_INTERES >= 0) {
				System.out.println("Muy bien, has ganado algo de interés.");
				balance = balance + (TASA_INTERES*balance)/12;
			}
		}
		else {
			System.out.println("Serás cargado con una penalidad.");
			balance = balance-PENALIDAD_SOBREGIRO;
		}
		System.out.println("Después de ajustar un mes de interés y penalidades, \n su nuevo saldo es: $" + balance);
	}
}

