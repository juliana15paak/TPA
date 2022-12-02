import java.util.Scanner;
public class TabuadaVetor {
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		int a[], i, j, res;
		a=new int[5];
		for(i=0;i<a.length;i++) {
			System.out.println("Digite um número: ");
			a[i]=in.nextInt();
		}
		for(i=0;i<a.length;i++) {
			for(j=1;j<=10;j++) {
				res=a[i]*j;
				System.out.println(a[i]+" x "+j+" = "+res);
			}
		}
	}
}
