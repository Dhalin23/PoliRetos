package CadenaDeCaracteres;

import java.util.Scanner;

public class C05 {
 @SuppressWarnings("resource")
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        StringBuilder fraseInvertida = new StringBuilder();// Invertir la frase y convertir vocales a mayúsculas
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {  // Convertir vocales a mayúsculas
                fraseInvertida.append(Character.toUpperCase(letra));
            } else {
                fraseInvertida.append(letra);
            }
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }
}
