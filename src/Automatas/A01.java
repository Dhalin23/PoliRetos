package Automatas;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena para validar (a*b+c): ");
        String input = scanner.nextLine();
        if (validarCadena(input)) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }
        scanner.close();
    }
    public static boolean validarCadena(String cadena) {
        int estado = 0; 
        for (char c : cadena.toCharArray()) {
            switch (estado) {
                case 0: if (c == 'a') {estado = 0; } else if (c == 'b') { estado = 1; } else {  return false; } break;
                case 1: if (c == 'b') {estado = 1; } else if (c == 'c') { estado = 2; } else {  return false; } break;
                case 2: if (c == 'c') {estado = 2; } else { return false;} break;
            }
        }
        return estado == 2;
    }
}
