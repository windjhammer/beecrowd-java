package bee1040;

import java.io.IOException;
import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("0.0");
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double media = ((N1 * 2.0) + (N2 * 3.0) + (N3 * 4.0) + (N4 * 1.0)) / 10;
        System.out.println("Media: " + df.format(media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            media = (media + notaExame) / 2;
            System.out.println("Nota do exame: " + df.format(notaExame));
            if (media >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + df.format(media));
            } else {
                System.out.println("Aluno reprovado.");
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }

}