package Figuras;

import java.util.Scanner;

public class figura9 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de niveles de la pirámide: ");
            int niveles = scanner.nextInt();
    
            for (int i = 1; i <= niveles; i++) {
                // Espacios a la izquierda para centrar cada nivel de la pirámide
                for (int j = niveles; j > i; j--) {
                    System.out.print("    "); // Espacios para alinear la pirámide
                }
                System.out.print("___");        // Imprimir el borde superior izquierdo
                if (i > 1) {               // Espacios en el medio del nivel
                    for (int k = 1; k < (i - 1) * 2; k++) {
                        System.out.print("    "); // Espacios para el medio del nivel
                    }
                    System.out.print("___");                // Imprimir el borde superior derecho
                }
                System.out.println();
    
                if (i < niveles) { // No imprimir soportes en el último nivel
                    for (int j = niveles; j > i; j--) {
                        System.out.print("    "); // Espacios para alinear el soporte
                    }
                    
                    System.out.print("|   ");       // Imprimir el soporte izquierdo
                    if (i > 1) {           // Espacios en el medio entre los soportes
                        for (int k = 1; k < (i - 1) * 2; k++) {
                            System.out.print("    "); // Espacios para el medio entre soportes
                        }
                        System.out.print("  |");       // Imprimir el soporte derecho
                    }
                    System.out.println();
                }
            }
    
            scanner.close();
        }
}

