import java.util.Scanner;
public class Potencia {
	public static void main(String[]args) {
		int b, e, p, i;
		i=1;
		p=0;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o valor da base: ");
		b = in.nextInt();
		System.out.println("Digite o valor do expoente: ");
		e = in.nextInt();
		p = b;
		while (i<e) {
			p = p*b;
			i++;
		}
		System.out.println("A potencia é: "+p);
	}
}
