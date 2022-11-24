import java.util.Scanner;
public class Raiz {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int a[], i;
		double b[];
		a = new int[10];
		b = new double[10];
		for(i=0; i<10; i++) {
			System.out.println("Digite um  número inteiro: ");
			a[i]=in.nextInt();
			b[i]=Math.sqrt(a[i]);
		}
		for(i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0; i<10;i++) {
			System.out.print(b[i]+" ");
		}
	}
}