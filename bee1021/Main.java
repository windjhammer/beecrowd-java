package bee1021;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        int notas = (int) total;
        int moedas = (int) ((total - notas) * 100);
        int notasDe100 = notas / 100;
        notas -= notasDe100 * 100;
        int notasDe50 = notas / 50;
        notas -= notasDe50 * 50;
        int notasDe20 = notas / 20;
        notas -= notasDe20 * 20;
        int notasDe10 = notas / 10;
        notas -= notasDe10 * 10;
        int notasDe5 = notas / 5;
        notas -= notasDe5 * 5;
        int notasDe2 = notas / 2;
        notas -= notasDe2 * 2;
        int moedasDe1 = notas;
        notas -= moedasDe1 * 1;
        int moedasDe50 = moedas / 50;
        moedas -= moedasDe50 * 50;
        int moedasDe25 = moedas / 25;
        moedas -= moedasDe25 * 25;
        int moedasDe10 = moedas / 10;
        moedas -= moedasDe10 * 10;
        int moedasDe05 = moedas / 5;
        moedas -= moedasDe05 * 5;
        int moedasDe01 = moedas;

        System.out.println("NOTAS:");
        System.out.println(notasDe100 + " nota(s) de R$ 100.00");
        System.out.println(notasDe50 + " nota(s) de R$ 50.00");
        System.out.println(notasDe20 + " nota(s) de R$ 20.00");
        System.out.println(notasDe10 + " nota(s) de R$ 10.00");
        System.out.println(notasDe5 + " nota(s) de R$ 5.00");
        System.out.println(notasDe2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");

        System.out.println(moedasDe1 + " moeda(s) de R$ 1.00");
        System.out.println(moedasDe50 + " moeda(s) de R$ 0.50");
        System.out.println(moedasDe25 + " moeda(s) de R$ 0.25");
        System.out.println(moedasDe10 + " moeda(s) de R$ 0.10");
        System.out.println(moedasDe05 + " moeda(s) de R$ 0.05");
        System.out.println(moedasDe01 + " moeda(s) de R$ 0.01");

        sc.close();
    }

}