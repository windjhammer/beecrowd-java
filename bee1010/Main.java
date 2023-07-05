package bee1010;

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
        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        double valorPeca1, valorPeca2;
        codigoPeca1 = sc.nextInt();
        quantidadePeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        quantidadePeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        double total = (valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        sc.close();
    }
 
}