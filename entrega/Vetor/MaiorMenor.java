import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		int a[], i, maior, menor;
		a=new int[10];
		System.out.println("Digite um número:");
		a[0]=in.nextInt();
		maior=a[0];
		menor=a[0];
		for(i=1;i<a.length;i++) {
			System.out.println("Digite um número: ");
			a[i]=in.nextInt();
			if(a[i]>maior) {
				maior=a[i];
			}else if(a[i]<menor){
				menor=a[i];
			}
		}
		System.out.println("O maior valor é "+maior+", e o menor valor é "+menor);
	}
}
