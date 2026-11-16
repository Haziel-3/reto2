package reto2;

import java.util.Scanner;

public class Funciones1 {
	
	public static void millasAkm(Scanner sc) {

		System.out.print("Introduce las millas: ");
		double millas = sc.nextDouble();
		double km = millas * 1.60934;
		System.out.println("Kilometros: " + km);
	}

	public static void kmAmillas(Scanner sc) {
		System.out.print("Introduce los kilometros: ");
		double km = sc.nextDouble();
		double millas = km / 1.60934;
		System.out.println("Millas: " + millas);
	}
	

	public static void menuLongitud(Scanner sc) {

		int opcion;

		do {

			System.out.println("\n Elige menú de longitud");
			System.out.println("1. Millas a kilometros");
			System.out.println("2. Kilometros a millas");
			System.out.println("0. Volver al menu principal");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				millasAkm(sc);
				break;

			case 2:
				kmAmillas(sc);
				break;

			case 0:
				System.out.println("Saliendo");
				break;
			}

		} while (opcion != 0);
	}
}

	
