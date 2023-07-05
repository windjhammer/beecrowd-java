package bee1012;

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
        double A = sc.nextFloat();
        double B = sc.nextFloat();
        double C = sc.nextFloat();
        double pi = 3.14159;
        double trianguloRetangulo = (A * C)/2;
        double circulo = (pi * Math.pow(C, 2));
        double trapezio = (A + B) / 2 * C;
        double quadrado = (Math.pow(B, 2));
        double retangulo = A * B;
        System.out.printf("TRIANGULO: %.3f\n" , trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
        sc.close();
    }
 
}