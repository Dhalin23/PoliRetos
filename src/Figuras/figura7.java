package Figuras;

import java.util.Scanner;

public class figura7 {
    public void figura7() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de escalones: ");
        int escalones = scanner.nextInt();
        for (int i = 1; i <= escalones; i++) {
            for (int j = 1; j < i; j++) {    // espacios para alinear el escalón en diagonal
                System.out.print("     ");
            }
            System.out.println("___");    // imprimir la línea horizontal del escalón
            for (int j = 1; j < i; j++) {// espacios para alinear el soporte vertical
                System.out.print("     ");
            }
            System.out.println("   |");      // imprimir el soporte vertical del escalón
        }
    }
        
}
