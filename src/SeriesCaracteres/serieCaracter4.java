package SeriesCaracteres;
import java.util.Scanner;

public class serieCaracter4 {
    public void SC4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de operadores a imprimir: ");
        int cantidad = scanner.nextInt();
        String[] operadores = {"+", "-", "*", "/"};
        System.out.println("Secuencia de operadores:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(operadores[i % 4] + " "); 
        }
        scanner.close();
    }
    
}
