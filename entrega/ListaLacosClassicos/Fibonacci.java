package teste;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int proximo, posicao, anterior, atual, termo;
		System.out.print("Digite at� qual termo a sequ�ncia de Fibonacci ir�:");
		termo=in.nextInt();
		posicao=1;
		anterior=0;
		atual=1;
		System.out.print(atual);
		do {
			proximo=anterior+atual;
			System.out.print(" "+proximo);
			anterior=atual;
			atual=proximo;
			posicao++;
		}while(posicao<termo);
	}
}
