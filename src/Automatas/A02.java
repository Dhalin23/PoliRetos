package Automatas;

import java.util.Scanner;

public class A02 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena para validar (ab+ca): ");
        String input = scanner.nextLine();
        if (validoCadena(input)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }
        scanner.close();
    }
    public static boolean validoCadena(String cadena) {
        int estado = 0; 
        for (char c : cadena.toCharArray()) {
            switch (estado) {
                case 0: if (c == 'a') { estado = 1; } else { return false; } break;
                case 1: if (c == 'b') { estado = 2; } else { return false; }break;
                case 2: if (c == 'b') { estado = 2; } else if (c == 'c') { estado = 3; } else { return false; } break;
                case 3: if (c == 'a') { estado = 4; } else { return false; } break;
            }
        }
        return estado == 4;
    }
}
