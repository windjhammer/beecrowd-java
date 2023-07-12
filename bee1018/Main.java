package bee1018;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println(X);
        System.out.printf("%d nota(s) de R$ 100,00\n", X/100);
        X = X%100;
        System.out.printf("%d nota(s) de R$ 50,00\n", X/50);
        X = X%50;
        System.out.printf("%d nota(s) de R$ 20,00\n", X/20);
        X = X%20;
        System.out.printf("%d nota(s) de R$ 10,00\n", X/10);
        X = X%10;
        System.out.printf("%d nota(s) de R$ 5,00\n", X/5);
        X = X%5;
        System.out.printf("%d nota(s) de R$ 2,00\n", X/2);
        X = X%2;
        System.out.printf("%d nota(s) de R$ 1,00\n", X/1);
        X = X%1;
        sc.close();
    }
 
}