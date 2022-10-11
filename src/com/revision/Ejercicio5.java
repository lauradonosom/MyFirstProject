package com.revision;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Ingrese una palabra: ");
		String n = sc.nextLine();

		System.out.println("Su palabra ingresada es: " +n+ " tiene "+n.length()+ " entre carcateres, letras y espacios :D");
	}

}
