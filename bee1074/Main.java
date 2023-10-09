package bee1074;

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
        int N = sc.nextInt();
        for (int i = 0; i<N; i++){
            int X = sc.nextInt();
            if(X == 0){
                System.out.println("NULL");
            }
            else if(X%2 == 0 && X > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(X%2 == 0 && X< 0 ){
                System.out.println("EVEN NEGATIVE");
            }
            else if (X%2 != 0 && X > 0){
                System.out.println("ODD POSITIVE");
            }
            else if (X%2 != 0 && X<0){
                System.out.println("ODD NEGATIVE");
            }
        }
        sc.close();
    }
}