package bee1134;

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
        int x = 0, alc = 0, gas = 0, die = 0;
        while (x != 4){
            x = sc.nextInt();
            switch (x){
                case 1: alc++;break;
                case 2: gas++;break;
                case 3: die++;break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alc);
        System.out.printf("Gasolina: %d\n", gas);
        System.out.printf("Diesel: %d\n", die);
        sc.close();
    }
 
}