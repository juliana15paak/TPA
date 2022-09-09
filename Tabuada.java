import java.util.Scanner;
public class Tabuada {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int i, n, res;
		i=1;
		while (i<=10) {
			System.out.println("Digite um número inteiro: ");
			n = in.nextInt();
			res = n*i;
			System.out.println(n+"x"+i+"="+res);
			i++;
		}
		in.close();
	}
}
