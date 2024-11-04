package Figuras;

import java.util.Scanner;

public class figura19 {     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        int[][] sequence = new int[filas][];   // Inicializar la primera fila con solo "*"
        sequence[0] = new int[]{2};  // "*" representado como 2

        for (int i = 1; i < filas; i++) {
            sequence[i] = new int[i + 1];
            sequence[i][0] = 1;  // Primer elemento es siempre "+"
            sequence[i][i] = 2;  // Último elemento es siempre "*"

            for (int j = 1; j < i; j++) {       // Calcular los elementos intermedios
                sequence[i][j] = sequence[i - 1][j - 1] + sequence[i - 1][j];
            }
        }
     
        for (int i = 0; i < filas; i++) { //patron 
            for (int j = 0; j < sequence[i].length; j++) {
                if (sequence[i][j] == 1) {
                    System.out.print("+ ");
                } else if (sequence[i][j] == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(sequence[i][j] + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
    }