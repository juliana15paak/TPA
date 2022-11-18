import java.util.Scanner;
public class TrianguloEEI {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite o tamanho dos três lados do triângulo, respectivamente:");
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		if (a+b>c && b+c>a && a+c>b) {
			System.out.println("Ok, isso é um triângulo.");
			if(a==b && b==c) {
				System.out.println("E é um triângulo equilátero!");
			}
			else if(a==b | a==c | b==c) {
				System.out.println("E é um triângulo isósceles!");
			}
			else {
				System.out.println("E é um triângulo escaleno!");
			}
		}
		else {
			System.out.println("Isso não é um triângulo!");
		}
	}
}
