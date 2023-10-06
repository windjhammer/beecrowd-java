package bee1146;

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
        int x = sc.nextInt();
        while (x != 0) {
            for (int i = 1; i <= x; i++) {
                if (i == x) {
                    System.out.print(i + "\n");
                } 
                else {
                    System.out.print(i + " ");
                }
            }
            x = sc.nextInt();
        }
        sc.close();
    }

}