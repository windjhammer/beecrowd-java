package bee1013;

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
        int A, B, C, maior;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if (A > B && A > C){
            maior = A;
        }
        else if (B > C){
            maior = B;
        }
        else {
            maior = C;
        }
        System.out.print(maior + " eh o maior\n");
        sc.close();
    }
 
}