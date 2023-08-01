package bee1046;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        if (inicio > fim) {
            System.out.println("O JOGO DUROU " + (24 - (inicio - fim)) + " HORA(S)");
        } 
        else if (inicio < fim) {
            System.out.println("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        sc.close();
    }
    
}