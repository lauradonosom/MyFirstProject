package com.switchcase;

public class EjemploMultipleOpts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char tipoHuevo = 'a';
		switch (tipoHuevo)
		{
		case 'A':
		case 'a':
			System.out.println("Huevo tipo A.");
			break;
		case 'B':
		case 'b':
			System.out.println("Huevo tipo B.");
			break;
		default:
			System.out.println("Solo tenemos huevos tipo A y B.");
			break;
		}

	}

}
