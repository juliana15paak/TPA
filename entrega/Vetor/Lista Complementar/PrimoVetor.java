import java.util.Scanner;
public class PrimoVetor {
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		int a[], i;
		a=new int[10];
		for (i=0; i<a.length; i++) {
			System.out.println("Digite um n�mero inteiro: ");
			a[i]=in.nextInt();
		}
		for (i=0; i<a.length; i++) {
			if (a[i]==2){
				System.out.println(a[i]+" é um número primo");
			}
			else if(a[i]%2!=1){
				System.out.println(a[i]+" não é um número primo");
			}else{
				System.out.println(a[i]+" é um número primo");
			}
		}
	}
}
