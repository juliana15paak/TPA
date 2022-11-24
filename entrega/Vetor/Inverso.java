import java.util.Scanner;
public class Inverso {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i, j;
		a = new int[10];
		b = new int[10];
		j=9;
		for(i=0; i<10; i++) {
			System.out.println("Digite um  número inteiro: ");
			a[i]=in.nextInt();
			b[j]=a[i];
			j--;
		}
		System.out.println("Números invertidos: ");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
	}
}
