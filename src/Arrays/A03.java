package Arrays;

import java.util.Scanner;

public class A03 {
@SuppressWarnings("resource") 
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese su nombre
    System.out.print("Ingrese su nombre para dibujarlo en un plano cartesiano: ");
    String nombre = scanner.nextLine();
    int maxY = 2 * (nombre.length() - 1); // Ajustamos el máximo de Y

    for (int i = maxY; i >= 0; i--) { // Eje Y desde maxY hasta 0
        System.out.print(i + "| "); // Mostrar el valor de Y
        for (int x = 0; x < nombre.length(); x++) { // Eje X desde 0 hasta la longitud del nombre
            // Usar letras del nombre en cada posición del eje Y
            if (i == 2 * x) {
                System.out.print(nombre.charAt(x));
            } else if (i == 0) {
                // Dibujar el eje X solo en la línea Y=0
                System.out.print(" ");
            } else {
                System.out.print(" "); // Espacio en blanco
            }
        }
        System.out.println(); // Nueva línea
    }

    // Mostrar el eje X sin números
    System.out.println(" -----------------------------");
}
}
