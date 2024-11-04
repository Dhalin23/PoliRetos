package Figuras;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de niveles de la pirámide: ");
        int niveles = scanner.nextInt();

        // Imprimir la primera fila
        System.out.println("*");
        
        // Imprimir la segunda fila
        System.out.println("+ *");

        // Inicializar la fila anterior
        int[] filaAnterior = {3}; // Comenzamos con 3 en la tercera fila

        // Generar las filas restantes
        for (int i = 3; i <= niveles; i++) {
            System.out.print("+ "); // Comenzar la fila con un símbolo +

            // Crear un nuevo arreglo para la fila actual
            int[] filaActual = new int[i]; // La longitud es i, ya que no hay el último símbolo *

            // Calcular los números de la fila actual
            filaActual[0] = i + 2; // El primer número en la fila es (i + 2)

            for (int j = 1; j < i; j++) {
                // La lógica es sumar los dos anteriores de filaAnterior
                filaActual[j] = filaAnterior[j - 1] + (j > 1 ? filaAnterior[j - 2] : 0);
            }

            // Imprimir los números de la fila actual
            for (int j = 0; j < filaActual.length; j++) {
                System.out.print(filaActual[j] + " ");
            }

            // Imprimir el símbolo * al final
            System.out.print("*");
            System.out.println();

            // Actualizar la fila anterior
            filaAnterior = filaActual;
        }

        scanner.close();
    }
}
