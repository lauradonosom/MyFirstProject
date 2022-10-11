package com.quiz1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Punto3 {


	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);

		String palabra = (JOptionPane.showInputDialog("Dijite su palabra a contar"));
		palabra = palabra.replaceAll("\\s","");
		for (int i=0;i<palabra.length();i++) {
			System.out.println("Letras " + (i+1) + ":" + palabra.substring(i, i+1));
			StringTokenizer sc = new StringTokenizer(palabra);
			System.out.println(sc.countTokens());

		}
	}


}
