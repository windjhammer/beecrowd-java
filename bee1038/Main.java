package bee1038;

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
        double total;
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        switch (codigo) {
            case 1:
                total = quantidade * 4;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5;
                break;
            case 4:
                total = quantidade * 2;
                break;
            case 5:
                total = quantidade * 1.5;
                break;
            default:
                total = 0;
        }
        System.out.printf("Total: R$ %.2f", total);
        sc.close();
    }

}