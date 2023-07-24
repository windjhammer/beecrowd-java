package bee1042;

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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x < y && x < z) {
            System.out.println(x);
            if (y < z) {
                System.out.println(y);
                System.out.println(z);
            } else {
                System.out.println(z);
                System.out.println(y);
            }
        } else if (y < z) {
            System.out.println(y);
            if (x < z) {
                System.out.println(x);
                System.out.println(z);
            } else {
                System.out.println(z);
                System.out.println(x);
            }
        }
        else {
            System.out.println(z);
            if (x < y){
                System.out.println(x);
                System.out.println(y);
            }
            else{
                System.out.println(y);
                System.out.println(x);
            }
        }
        System.out.println();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }

}