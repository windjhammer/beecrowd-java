package bee1040;

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
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double media = ((N1 * 2.0) + (N2 * 3.0) + (N3 * 4.0) + (N4 * 1.0)) / 10;
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            media = (media + notaExame) / 2;
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media);
            } else {
                System.out.println("Aluno reprovado.");
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }

}