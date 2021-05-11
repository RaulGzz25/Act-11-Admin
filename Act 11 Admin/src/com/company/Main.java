package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        int valor = 1;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1 -> Suma");
            System.out.println("2 -> Resta");
            System.out.println("3 -> Multiplicación");
            System.out.println("4 -> División");

            int value = scanner.nextInt();

            switch (value) {
                case 0:
                    System.out.println("Número no valido");
                    break;

                case 1: // Operación de Suma
                    System.out.println("¿Cuantos valores se van a ingresar?");
                    int Cant = scanner.nextInt();
                    double[] array = new double[Cant];

                    System.out.println("Ingrese los valores");
                    for (int i = 0; i < array.length; i++) {
                        array[i] = scanner.nextDouble();
                    }

                    int suma = 0;
                    for (int i = 0; i < array.length; i++) {
                        suma += array[i];
                    }
                    System.out.println("El resultado de la suma es: " + suma);
                    break;

                case 2: // Operación de Resta
                    System.out.println("¿Cuantos valores se van a ingresar?");
                    int CantResta = scanner.nextInt();
                    int[] arrayResta = new int[CantResta];

                    System.out.println("Ingrese los valores");
                    for (int i = 0; i < arrayResta.length; i++) {
                        arrayResta[i] = scanner.nextInt();
                    }

                    int resta = arrayResta[0];
                    for (int i = 1; i < arrayResta.length; i++) {
                        resta -= arrayResta[i];
                    }
                    System.out.println("El resultado de la resta es: " + resta);
                    break;

                case 3: // Operación de Multiplicación
                    System.out.println("Ingrese el primer valor");
                    int valor1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    int valor2 = scanner.nextInt();
                    int Multi = valor1 * valor2;
                    System.out.println("El resultado de la multiplicación es: " + Multi);
                    break;

                case 4: // Operación de División
                    System.out.println("Ingrese el valor del dividendo");
                    int dividendo = scanner.nextInt();
                    System.out.println("Ingrese el valor del divisor");
                    int divisor = scanner.nextInt();
                    double division = 0;
                    division = dividendo / divisor;
                    System.out.println("El resultado de la divisón es: " + division);
                    break;

                default:
                    System.out.println("Opción no valida");
            }
            System.out.println("Desea realizar otra operación?");
            System.out.println("1 -> Si");
            System.out.println("2 -> No");
            valor = scanner.nextInt();
        }while(valor == 1);
    }
}
