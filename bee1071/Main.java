package bee1071;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total = 0;
        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        } else {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    total += i;
                }
            }
        }
        System.out.println(total);
        sc.close();
    }

}