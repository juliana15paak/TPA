import java.util.Scanner;
public class Primo {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Digite um n�mero inteiro: ");
		n=in.nextInt();
		if (n==2){
			System.out.println(n+" � um n�mero primo");
		}
		else if(n%2!=1){
			System.out.println(n+" n�o � um n�mero primo");
		}else{
			System.out.println(n+" � um n�mero primo");
		}
	}
}
