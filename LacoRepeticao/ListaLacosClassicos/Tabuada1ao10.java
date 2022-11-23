public class Tabuada1ao10 {
	public static void main (String args[]) {
		int f, i, res;
		for (f=1; f<=10; f++) {
			for (i=1; i<=10; i++) {
				res=f*i;
				System.out.println(f+" x "+i+" = "+res);
			}
		}
	}
}
