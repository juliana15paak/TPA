import java.util.Scanner;
public class Primo {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Digite um número inteiro: ");
		n=in.nextInt();
		if (n==2){
			System.out.println(n+" é um número primo");
		}
		else if(n%2!=1){
			System.out.println(n+" não é um número primo");
		}else{
			System.out.println(n+" é um número primo");
		}
	}
}
