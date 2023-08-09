package bee1064;

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double soma = 0, media = 0;
        int positivos = 0;
        double[] valores = new double[6];
        for(int i = 0; i<6;i++){
            valores[i] = sc.nextDouble();
            if(valores[i] > 0){
                soma = (soma+valores[i]);
                positivos++;
            }
        }
        System.out.println(positivos + " valores positivos");
        media = soma/positivos;
        System.out.printf("%.1f\n", media);
        sc.close();
    }
 
}