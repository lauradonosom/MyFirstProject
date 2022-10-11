package com.arreglos.bidimensionales;

public class EjemploBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int[][] intArray;
        intArray=new int[5][8];
        
        System.out.println(intArray.length+" "+intArray[3].length);
        
        System.out.println("-------------------------");
        
        int[][] intNumeros = {{1,3,5},
        					  {2,7,4},
        					  {3,10,2},
        					  {0,8,3}};
        
        System.out.println(intNumeros.length+" "+intNumeros[3].length);
        
        for(int i=0;i<intNumeros.length;i++) {
        	for(int j=0;j<intNumeros[i].length;j++) {
        		System.out.print(intNumeros[i][j]+" ");
        	}
        	System.out.println();
        }
        
        System.out.println("-------------------------");
        
        //Calcular suma
        int[] acumulaSuma = new int[intNumeros.length];
        for(int i=0;i<intNumeros.length;i++) {
        	for(int j=0;j<intNumeros[i].length;j++) {
        		acumulaSuma[i] = acumulaSuma[i] + intNumeros[i][j];
        	}
        }
        
        for(int i=0;i<intNumeros.length;i++) {
        	System.out.print(acumulaSuma[i] + " ");
        }
        
        
        
        /*
        int[][] array = new int[20][20];
        int[][] pattern = {{1},
        				   {1,1},
        				   {1,1,1},
        				   {1,1,1,1},
        				   {1,1,1},
        				   {1,1},
        				   {1}};
        
        
        for(int i=1;i<array.length;i++){  
        	for(int j=1;j<array[i].length;j++){
        		if(i==j) {
        			array[i][j]=1;
        		}   
    		}
		}
        
        for(int i=1;i<array.length;i++){  
        	for(int j=1;j<array[i].length;j++){
        		System.out.print(array[i][j]+" ");
        	}
        	System.out.println();
		}*/

	}

}
