import java.util.Scanner;
public class Combustivel {
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		double km, litro, media;
		System.out.println("Digite a distância percorrida em quilômetros:");
		km=in.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustível em litros:");
		litro=in.nextDouble();
		media=km/litro;
		if(media>=10) {
			System.out.println(media + "O carro é econômico");
		}
		else {
			System.out.println(media + "O carro não é econômico");
		}
	}
}
