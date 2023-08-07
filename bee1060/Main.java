package bee1060;

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
        double[] valores = new double[6];
        int positivos = 0;
        for(int i=0;i<6;i++){
            valores[i] = sc.nextDouble();
            if(valores[i] > 0){
                positivos++;
            }
        }
        System.out.println(positivos + " valores positivos");
        sc.close();
    }
 
}