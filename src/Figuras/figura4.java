package Figuras;

import java.util.Scanner;

public class figura4 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        
        for (int i = 1; i <= filas; i++) {
            // Espacios a la izquierda
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }
        
        scanner.close();
    }
}
