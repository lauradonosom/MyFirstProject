package com.bucles;

import javax.swing.JOptionPane;

public class LoopsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int semanas = 5;
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias:"));
		
		for (int i = 0; i < 10; i++) {
            // Si el numero es 2, saltar y continue con la siguiente iteracion
            if (i == 2)
                continue;
 
            System.out.print(i + " ");
        }

			// ciclo externo, imprime semanas
			for (int i = 1; i <= semanas; ++i) {
				System.out.println("Semana: " + i);
				// ciclo interno, imprime dias
				for (int j = 1; j <= dias; ++j) {
					
					if(j%2==0) {
						System.out.println("  Día: " + j);
						continue;
					}
				}
				
			}
		/*
		System.out.println("--------------------------------");
/*
		// manejo de filas
		for (int i = 1; i <=3 ; ++i) {

			//manejo de columnas
			for (int j = 1; j <= 3; ++j) {
				System.out.println(i + " " + j);
			}
			System.out.println("Fin del ciclo interno");
		}

		//ciclo dinamico y que valide
		/*
		 * 
			int semanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de semanas "));
			int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de dias"));

			// ciclo externo, imprime semanas
			for (int i = 1; i <= semanas; ++i) {
				System.out.println("Semana: " + i);

				// ciclo interno, imprime dias
				for (int j = 1; j <= dias; ++j) {
					System.out.println("  Día: " + j);
				}
			}
			
			int semanas, dias;
		do {
			semanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de semanas (1-52)"));
		} while ((semanas<0 || semanas>=52));
		do {
			dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de dias (1-7)"));
		} while ((dias<=0 || dias >=7) );
		
		omitir una semana
		 if(i == 2) {
          break;
        }
		
		dias pares
					if(j % 2 != 0) {
						  continue;
					}
		 */
		

	}

}
