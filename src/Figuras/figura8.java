package Figuras;

import java.util.Scanner;

public class figura8 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de escalones: ");
        int escalones = scanner.nextInt();

        // Imprimir escalones desde el lado derecho
        for (int i = 1; i <= escalones; i++) {
            // Espacios para alinear el escalón en diagonal desde la derecha
            for (int j = escalones; j > i; j--) {
                System.out.print("     ");
            }
            // Imprimir la línea horizontal del escalón
            System.out.println("___");

            // Espacios para alinear el soporte vertical desde la derecha
            for (int j = escalones; j > i; j--) {
                System.out.print("     ");
            }
            // Imprimir el soporte vertical del escalón
            System.out.println("|    ");
        }

        scanner.close();
    }
}
