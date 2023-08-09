package bee1066;

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
        int[] valores = new int[5];
        int pares = 0, impares = 0, positivos = 0, negativos = 0;
        for (int i = 0; i < 5; i++) {
            valores[i] = sc.nextInt();

            if (valores[i] > 0) {
                positivos++;
            } else if (valores[i] < 0) {
                negativos++;
            }
            if (valores[i] % 2 == 0) {
                pares++;
            } else if (valores[i] % 2 != 0) {
                impares++;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
        sc.close();
    }
}