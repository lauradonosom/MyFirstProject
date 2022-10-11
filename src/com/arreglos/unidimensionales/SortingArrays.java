package com.arreglos.unidimensionales;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = {4 , 20 , 3 , 16 , 25 , 60 , 7 , 8 , 19};
		for (int i = 0; i < intArray.length; i++)   
		{  
			for (int j = i + 1; j < intArray.length; j++)   
			{  
				int tmp = 0;  
				if (intArray[i] > intArray[j])   
				{  
					tmp = intArray[i];  
					intArray[i] = intArray[j];  
					intArray[j] = tmp;  
				}  
			}  
			System.out.print(intArray[i]+" ");  
		}
		
		System.out.println();  
		
		int [] intArray2 = {4 , 20 , 3 , 16 , 25 , 60 , 7 , 8 , 19};
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		

	}
}
