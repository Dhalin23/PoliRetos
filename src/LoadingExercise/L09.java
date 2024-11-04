package LoadingExercise;

import java.util.Scanner;

public class L09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();
        int longitud = nombre.length(); // obtener la longitud del nombre

        for (int i = 0; i < longitud; i++) {
            char letra = nombre.charAt(i); // obtener la letra en la posición i
            int porcentaje = (i + 1) * 100 / longitud; // calcular el porcentaje

        
            for (int j = 0; j < i; j++) { //forma escalonada 
                System.out.print(" "); // imprimir espacio en blanco
            }
            System.out.println(letra + " " + porcentaje + "%");
            try {
                Thread.sleep(500); // esperar 500 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // manejo de la excepción
            }
        }
        System.out.println("Carga completa!"); 
        scanner.close(); 
    }
}
