import java.util.Scanner;
public class Par {
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		int a[], i, q;
		a = new int[10];
		q = 0;
		for (i=0;i<a.length;i++) {
			System.out.println("Digite o "+(i+1)+"° número inteiro: ");
			a[i]=in.nextInt();
		}
		System.out.println("Os números pares digitados são: ");
		for(i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
				q++;
			}
		}
		System.out.println("Há "+q+" números pares.");
	}
}
