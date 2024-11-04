package SeriesCaracteres;

import java.util.Scanner;

public class serieCaracter5 {
 public void caracter5() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de caracteres a imprimir
        System.out.print("Ingrese la cantidad de operadores a imprimir: ");
        int c = scanner.nextInt();

        // Imprimir la secuencia de caracteres
        System.out.println("Secuencia de caracteres:");
        for (int i = 0; i < c; i++) {
            String caracter; // Variable para almacenar el carácter actual
            
            switch (i % 5) {
                case 0:
                    caracter = "\\"; break;
                case 1:
                    caracter = "|"; break;
                case 2:
                    caracter = "/"; break;
                case 3:
                    caracter = "-"; break;
                case 4:
                    caracter = "|"; break;
                default:
                    caracter = ""; 
            }
            System.out.print(caracter + " "); 
        }
        scanner.close();
    }
}
