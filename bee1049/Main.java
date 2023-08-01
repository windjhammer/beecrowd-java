package bee1049;

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
        String palvra1 = sc.next();
        String palvra2 = sc.next();
        String palvra3 = sc.next();
        if (palvra1 == "vertebrado") {
            if (palvra2 == "ave") {
                if (palvra3 == "carnivoro") {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (palvra3 == "onivoro") {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (palvra2 == "inseto") {
                if (palvra3 == "hematofago") {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (palvra3 == "hematofago") {
                    System.out.println("sanguesuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
        sc.close();
    }

}