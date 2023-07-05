package bee1011;

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
        double pi = 3.14159;
        int raio = sc.nextInt();
        double volume = (4.0/3) * pi * (Math.pow(raio, 3));
        System.out.printf("VOLUME = %.3f\n", volume);
        sc.close();
    }
 
}