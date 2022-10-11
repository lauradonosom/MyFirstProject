package com.revision;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;



public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 20;
		int maiz = 0, papa = 0, yuca = 0;

		int  [] cosechas = new int[n]; 
		int [] parcelas = new int[n];

		for(int i=0; i< cosechas.length; i++) {			
			cosechas[i]=(int)(Math.random()*(3))+1; 
			parcelas[i] = i;
		}		
		
		System.out.println(Arrays.toString(cosechas));
		System.out.println(Arrays.toString(parcelas));
		
		System.out.println("Desea ver sus parcelas?: "
				+ "\n1. SI"
				+ "\n2. No");		
		int m = sc.nextInt();
		System.out.println("Siendo 1.MAIZ  -- 2.PAPA -- 3.YUCA");
		

		do {


			for(int i=0; i< cosechas.length; i++) {			
				if(cosechas[i] == 1) {
					maiz++;					
				} if(cosechas[i] == 2) {
					papa++;
				}if(cosechas[i] == 3) {
					yuca++;
				}

			}		
			System.out.println("Usted tiene: " + maiz + " Cantidad de maiz");
			System.out.println("Usted tiene: " + papa + " Cantidad de papa");
			System.out.println("Usted tiene: " + yuca + " Cantidad de yuca");						
			
		
			System.out.println("Desea volver a sembrar una parcela nueva: 1. SI 2. NO");
			int res = sc.nextInt();

			if(res == 1) {
				System.out.println("Cual desea agregar "
						+"\n 1.Maiz"
						+"\n 2.Papa"
						+"\n 3.Yuca");
				int p = sc.nextInt();


				System.out.println("Cuantas desea agregar?");
				int addm = sc.nextInt();
				
				int div = addm / 2;

				for(int i=0; i< cosechas.length; i++) {			
					if(p == 1) {
						maiz= maiz + addm;
						papa--;
						yuca--;
						
					} if(p == 2) {						
						papa = papa + div;
						maiz--;
						yuca--;
						
					}if(p == 3) {
						yuca = yuca + div;
						papa--;
						maiz--;
					}

				}
				System.out.println("Su parcela quedo");
				System.out.println("Usted tiene: " + maiz + " Cantidad de maiz");
				System.out.println("Usted tiene: " + papa + " Cantidad de papa");
				System.out.println("Usted tiene: " + yuca + " Cantidad de yuca");
			}
			
			System.out.println("Cual desea cosechar:  "
					+"\n 1.Maiz"
					+"\n 2.Papa"
					+"\n 3.Yuca");
			
			int item = sc.nextInt();
			
			for(int i=0; i< cosechas.length; i++) {			
				if(item == 1) {
					maiz = 0;					
					if(cosechas[i] == 1) {
						cosechas[i] = 0;
					}
				}if(item == 2) {
					papa = 0;
					if(cosechas[i] == 2) {
						cosechas[i] = 0;
					}
					
				}if(item == 3) {
					yuca =0;
					if(cosechas[i] == 3) {
						cosechas[i] = 0;
					}
				}
			}	
			
			System.out.println(Arrays.toString(cosechas));	
			        
		
			
			m = sc.nextInt();


		} while(m == 1);








	}

}
