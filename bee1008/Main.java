package bee1008;

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
        int num = sc.nextInt();
        int horas = sc.nextInt();
        double valor = sc.nextDouble();
        double salario = valor * horas;
        System.out.printf("NUMBER = " + num);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f" , salario);
        System.out.println();
        sc.close();
    }
 
}