package bee1017;

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
        double tempo = sc.nextInt();
        double velMed = sc.nextInt();
        int consumo = 12;
        double combustivel = (tempo * velMed / consumo);
        System.out.printf("%.3f\n", combustivel);
        sc.close();
    }
 
}