package com.switchcase;

import javax.swing.JOptionPane;

public class EjemploBbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputBabies = JOptionPane.showInputDialog("Ingrese el nro de bebés:");
		int nroBabies = Integer.parseInt(inputBabies);
		
		switch (nroBabies)
		{
		case 1:
			System.out.println("Felicitaciones.");
			break;
		case 2:
			System.out.println("Wow. Gemelos.");
			break;
		case 3:
			System.out.println("Woooow. Trillizos.");
			break;
		case 4:
			System.out.print("Increíble; ");
			System.out.println(nroBabies +
					" babies.");
			break;
		default:
			System.out.println("No te creo.");
			break;
		}
	}

}
