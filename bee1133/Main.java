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
        int X, Y;
        
        X = sc.nextInt();
        Y = sc.nextInt();
        if(X > Y){
            for (int i = Y+1; i< X; i++){
                if (i%5 == 2 || i%5 == 3){
                    System.out.print(i+"\n");
                }
            }
        }
        else if(Y > X){
            for (int i = X+1; i < Y; i++){
                if (i%5 == 2 || i%5 == 3){
                    System.out.print(i+"\n");
                }
            }
        }
        sc.close();
    }
 
}