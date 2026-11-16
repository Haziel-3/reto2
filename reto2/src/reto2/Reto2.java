package reto2;

import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n Selecciona el tipo de conversión");
            System.out.println("1. Longitud");
            System.out.println("2. Peso");
            System.out.println("0. Salir");            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Funciones1.menuLongitud(sc);
                    break;
                case 2:
                    Funciones2.menuPeso();
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}