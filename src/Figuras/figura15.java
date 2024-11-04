package Figuras;

import java.util.Scanner;

public class figura15 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de niveles de la pirámide: ");
        int niveles = scanner.nextInt();
        
        for (int i = 0; i < niveles; i++) {
            int valor = 1; // El primer número de cada fila es siempre 1
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " "); // Imprimir el valor actual
                valor = valor * (i - j) / (j + 1); // Calcular el siguiente valor en la fila
            }
            System.out.println(); // Nueva línea para la siguiente fila
        }
        
        scanner.close();
    }
}
