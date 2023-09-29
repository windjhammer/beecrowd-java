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
        double nota1, nota2, x = 1;
        while (x == 1) {

            nota1 = sc.nextDouble();
            while (nota1 > 10 || nota1 < 0) {
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }
            nota2 = sc.nextDouble();
            while (nota2 > 10 || nota2 < 0) {
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }
            double media = (nota1 + nota2) / 2;
            System.out.println(String.format("media = %.2f", media));

            System.out.println("novo calculo (1-sim 2-nao)");
            x = sc.nextInt();
            while (x != 1 && x != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                x = sc.nextInt();
            }
        }
        sc.close();
    }

}
