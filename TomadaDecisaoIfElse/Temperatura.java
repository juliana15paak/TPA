import java.util.Scanner;
public class Temperatura {
	public static void main (String args[]){
		Scanner in = new Scanner (System.in);
		double f, c;
		System.out.println("Digite a temperatura em Fahrenheit:");
		f=in.nextDouble();
		c=(f-32)*0.5555;
		System.out.println(c);
		if (c<15){
			System.out.println("Frio");
		}
		else if (c>=22){
			System.out.println("Calor");
		}
		else if (c>=15){
			System.out.println("Ameno");
		}
		in.close();
	}
}
