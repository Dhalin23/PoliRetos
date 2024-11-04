package CadenaDeCaracteres;

import java.util.Scanner;

public class C09 {
@SuppressWarnings("resource")
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado.append(Character.toUpperCase(letra)); // Letras en mayúscula para índices pares
            } else {
                resultado.append(Character.toLowerCase(letra)); // Letras en minúscula para índices impares
            }
        }
        System.out.println("La frase final es: " + resultado);
    }
}
