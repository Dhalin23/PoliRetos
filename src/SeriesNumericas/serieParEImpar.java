package SeriesNumericas;
import java.util.Scanner;

public class serieParEImpar {
    public void SerieNum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad para la secuencia: ");
        int c = scanner.nextInt(); // c: cantidad

        System.out.println("Secuencia: ");
        int contadorImpar = 1; // Comienza desde 1 para los impares
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) { // posición par
                System.out.print("0 ");
            } else { // posición impar
                System.out.print(contadorImpar + " ");
                contadorImpar += 2; // Incrementa para el siguiente impar
            }
        }
        scanner.close();
    }
}
