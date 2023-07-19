package bee1021;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        int notas = (int) total;
        int moedas = (int) ((total - notas)*100);
        int notasDe100 = notas/100;
        notas -= notasDe100*100;
        int notasDe50 = notas/50;
        notas -= notasDe50*50;
        int notasDe20 = notas/20;
        notas -= notasDe20*20;
        int ;
        sc.close();
    }
 
}