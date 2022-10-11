package com.popQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);;
		boolean x;
		int List [] = new int[20];


		System.out.println("Ingrese su numero a buscar: ");
		int n = sc.nextInt();



		for(int i=0;i< List.length;i++) {			
			List[i]=(int)(Math.random()*(40))+1;   			
		}

		for(int i=0;i< List.length;i++) {			
			if(n == List[i]) {
				x = true;
				System.out.println("Su numero esta en el arreglo :D");
			}
		}

		System.out.print(Arrays.toString(List));


		do {

			for(int i=0;i< List.length;i++) {	

				if(List[i] == n) {
					System.out.println("\nSu numero si esta en el arreglo");
				} else {
					System.out.println("Su numero no esta en el arreglo ");
				}
			}

		}while(x = false);		

		System.out.println("\nIngrese su numero a buscar: ");
		n = sc.nextInt();	
		System.out.print(Arrays.toString(List));

	}

}
