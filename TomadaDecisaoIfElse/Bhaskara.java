import java.util.Scanner;
public class Bhaskara {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int a, b, c;
		double d, x1, x2;
		System.out.println("Digite os três valores, respectivamente, da equação de segundo grau:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=(b*b)+(-4*a*c);
		x1=(-(b)+ Math.sqrt(d))/(2*a);
		x2=(-(b)- Math.sqrt(d))/(2*a);
		if (d<0) {
			System.out.println("Não há raízes reais para a equação");
		}
		else if (d==0) {
			System.out.println("A raíz da equação é: " + x1);
		}
		else {
			System.out.println("As duas raízes da equação são: " + x1 + " e " + x2);
		}
	}
}