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
        String palavra1 = sc.next();
        String palavra2 = sc.next();
        String palavra3 = sc.next();
        if(palavra1 == "vertebrado"){
            if(palavra2 == "ave"){
                if(palavra3 == "carnivoro"){
                    System.out.println("aguia");
                }
                else{
                    System.out.println("pomba");
                }
            }
            else{
                if(palavra3 == "onivoro"){
                    System.out.println("homem");
                }
                else{
                    System.out.println("vaca");
                }
            }

        }
        else{
            if(palavra2 == "inseto"){
                if(palavra3 == "hematofago"){
                    System.out.println("pulga");
                }
                else{
                    System.out.println("lagarta");
                }
            }
            else{
                if(palavra3 == "hematofago"){
                    System.out.println("sanguessuga");
                }
                else{
                    System.out.println("minhoca");
                }
            }
        }
        sc.close();
    }
}