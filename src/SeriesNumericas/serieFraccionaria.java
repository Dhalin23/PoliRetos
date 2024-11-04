package SeriesNumericas;
import java.util.Scanner;

public class serieFraccionaria {
    public void SerieNum3() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de la secuencia: ");
        int c = scanner.nextInt();

        System.out.println("Generado:");

        for (int i = 0; i < c; i++) {
            int numerador = fibonacci(i); // Obtiene el n-ésimo número de Fibonacci
            int denominador = 2 * i + 1; // Calcula el denominador
            System.out.printf("%d/%d ", numerador, denominador); // Imprime la fracción
        }
    }
    /**
     * // Método para calcular el n-ésimo número de Fibonacci
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, f= 0;
        for (int i = 2; i <= n; i++) {
            f = a + b;
            a = b;
            b = f;
        }
        return f;
    }
}
