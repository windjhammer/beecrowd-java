package bee1094;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int n = 0, x = 0, total = 0, coelhos = 0, ratos = 0, sapos = 0;
		double porcentagemC = 0, porcentagemR = 0, porcentagemS = 0;
		String animal;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			x = sc.nextInt();
			animal =sc.next();
			total += x;
			if (animal.equalsIgnoreCase("C")) {
				coelhos += x;
			}else if(animal.equalsIgnoreCase("R")){
				ratos += x;
			}else if(animal.equalsIgnoreCase("S")){
				sapos += x;
			}
			porcentagemC = (double)((coelhos * 100.00) /total);
			porcentagemR = (double)((ratos * 100.00) /total);
			porcentagemS = (double)((sapos * 100.00) /total);
			
		}
		
		System.out.print("Total: "+total+" cobaias\n");
		System.out.print("Total de coelhos: "+coelhos+"\n");
		System.out.print("Total de ratos: "+ratos+"\n");
		System.out.print("Total de sapos: "+sapos+"\n");
		
		System.out.printf("Percentual de coelhos: %.2f",porcentagemC);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f",porcentagemR);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f",porcentagemS);
		System.out.print(" %\n");
        sc.close();
	}
}