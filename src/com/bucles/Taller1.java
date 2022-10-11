package com.bucles;

import javax.swing.JOptionPane;

public class Taller1  
{  
	public static void main(String[] args)  
	{  
		int n=5;  
		//inner loop  
		for (int i= 0; i<= n; i++)  
		{  
			//outer loop  
			for (int j=1; j<=n-i; j++)  {  
				System.out.print(" ");  
			}
			System.out.println("");
		}
	}  
}  