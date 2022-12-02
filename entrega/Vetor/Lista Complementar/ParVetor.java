import java.util.Scanner;
public class ParVetor {
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		int a[], i;
		a=new int[10];
		for (i=0; i<a.length; i++) {
			System.out.println("Digite um número inteiro: ");
			a[i]=in.nextInt();
		}
		System.out.println("Números pares: ");
		for (i=0; i<a.length; i++) {
			if (a[i]%2==0){
				System.out.print(a[i]+" ");
			}
		}
	}
}
