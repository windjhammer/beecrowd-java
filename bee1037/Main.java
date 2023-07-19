package bee1037;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float N = sc.nextFloat();
        if (N >= 0 && N <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (N >= 25 && N <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (N >= 50 && N <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (N >= 75 && N <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }

}