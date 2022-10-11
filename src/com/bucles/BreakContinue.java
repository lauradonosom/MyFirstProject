package com.bucles;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instruccion break
		for(int j=1;j<=10;j++) {
			System.out.print(j);
			if(j==4) {
				break;
			}         
		}
		
		System.out.println();
		
		//Instruccion continue
		for (int i = 0; i < 10; i++) {
		     // Si el numero es 2, saltar y continue con la siguiente iteración
		if (i%2==1){
		          continue;
		     }
		      System.out.print(i + " ");
		 }
		
	}

}
