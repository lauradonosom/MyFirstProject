package com.bucles;

public class TallerForAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimiendo una fila
		for(int i=1;i<=4;i++){  
			for(int j=1;j<=i;j++){  
				System.out.print(i); 
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		for(int i=5;i>=1;i--){  
			for(int j=1;j<=i;j++){  
				System.out.print(i); 
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		for(int i=0;i<=4;i++){  
			for(int j=0;j<=i;j++){  
				System.out.print(i*2); 
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		for(int i=1;i<=4;i++){  
			for(int j=1;j<=i;j++){ 
				if(i%2==0) {
					System.out.print("2");
				}else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		for(int i=0,p=0;i<=4;i++,p=p+2){  
			for(int j=0;j<=i;j++){  
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
