package CadenaDeCaracteres;

import java.util.Scanner;

public class C01 {
@SuppressWarnings("resource")
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        int cont = 0; //cont: contador de vocales 
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont++;
            }
        }

        // Mostrar la cantidad de vocales
        System.out.println("La frase tiene " + cont + " vocales.");
    }
}
