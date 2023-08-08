package bee1051;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    double valor = sc.nextDouble();
    double diferenca = 0, imposto = 0;
    if (valor > 4500) {
      imposto = 1000 * 0.08 + 1500 * 0.18;
      diferenca = valor - 4500;
      imposto += diferenca * 0.28;
    } else if (valor > 3000) {
      imposto = 1000 * 0.08;
      diferenca = valor - 3000;
      imposto += diferenca * 0.18;
    } else if (valor > 2000) {
      diferenca = valor - 2000;
      imposto = diferenca * 0.08;
    }
    if (imposto > 0) {
      System.out.printf("R$ %.2f\n", imposto);
    } else {
      System.out.println("Isento");
    }
    sc.close();
  }
}
