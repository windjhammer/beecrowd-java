package bee1065;

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
         int[] valores = new int[5];
         int pares = 0;
         for(int i = 0;i<5;i++){
            valores[i] = sc.nextInt();
            if(valores [i] % 2 == 0){
                pares++;
            }
         }
         System.out.printf("%d valores pares\n", pares);
         sc.close();
    }
 
}