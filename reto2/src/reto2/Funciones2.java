package reto2;

import java.util.Scanner;

public class Funciones2 {
	
	public static void kilogramosALibras() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los kilogramos: ");
        double kg = sc.nextDouble();
        double libras = kg * 2.20462;
        System.out.println(kg + " kg equivalen a " + libras + " libras");
    }
	
	public static void librasAKilogramos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las libras: ");
        double libras = sc.nextDouble();
        double kg = libras / 2.20462;
        System.out.println(libras + " libras equivalen a " + kg + " kg");
    }

	public static void menuPeso() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		 do {
			 System.out.println("\n Selecciona la conversión de peso");
	            System.out.println("1. Kilogramos a Libras");
	            System.out.println("2. Libras a Kilogramos");
	            System.out.println("0. Volver al menú principal");
			 opcion = sc.nextInt();
			 
			 switch (opcion) {
             case 1:
                 kilogramosALibras();
                 break;
             case 2:
                 librasAKilogramos();
                 break;
             case 0:
                 System.out.println("Saliendo");
                 break;
         }
     } while (opcion != 0);
 }

}
