package bee1021;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        double N = sc.nextDouble();
        System.out.println("NOTAS:");
        valor = (int) N/100;
        System.out.printf("%d nota(s) de R$ 100.00\n", valor);
        
        sc.close();
    }
 
}