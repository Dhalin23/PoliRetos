package LoadingExercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L12 { 
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int desplazamiento = 0;

        while (true) {
            System.out.print("Ingrese el número de espacios a deslizar: ");
            try {
                desplazamiento = scanner.nextInt();
                if (desplazamiento < 0) {
                    System.out.println("Por favor, ingrese un número entero positivo.");
                } else {
                    break; // Salir del bucle si la entrada es válida
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        String f1 = "   \\|||/";
        String f2 = "  ( > < ) ";
        String f3 = "ooO-(_)-Ooo";

        for (int i = 0; i <= desplazamiento; i++) {// Desplazamos las figuras a la derecha
            System.out.print("\033[H\033[2J");
            System.out.flush();// Mover el cursor a la posición inicial y limpiar la consola
       
            String espacios = " ".repeat(i); // Espacios para desplazar
            
            System.out.println(espacios + f1); // Imprimir primera figura
            System.out.println(espacios + f2); // Imprimir segunda figura
            System.out.println(espacios + f3); // Imprimir tercera figura

            Thread.sleep(300); // Ajusta el tiempo si lo deseas
        }
        for (int i = desplazamiento; i >= 0; i--) {   // Regresar las figuras a la posición originala
            System.out.print("\033[H\033[2J");
            System.out.flush();

            String espacios = " ".repeat(i); // Espacios para regresar
            System.out.println(espacios + f1); // Imprimir primera figura
            System.out.println(espacios + f2); // Imprimir segunda figura
            System.out.println(espacios + f3); // Imprimir tercera figura

            Thread.sleep(300); // Ajusta el tiempo si lo deseas
        }

        scanner.close();
    }
}
