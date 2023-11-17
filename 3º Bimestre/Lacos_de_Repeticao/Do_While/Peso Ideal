import java.util.Scanner;
public class ex2_Peso {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double p, a, pi;
		String  sx, r;
		
		do {
			System.out.print("Seu Peso:");
			p = in.nextDouble();
			System.out.print("Seu Sexo: (M ou F)" );
			sx = in.next();
			System.out.print("Sua Altura:");
			a = in.nextDouble();
			a = a*100;
			if (sx.equals ("m")|| (sx.equals ("M"))) {
				pi = 52 + (0.75*(a-152.4));
				if (pi < p) {
					System.out.println("Abaixo do peso");
				}else if (pi == p) {
					System.out.println("Peso Ideal");
				}else {
					System.out.println("Acima do peso");
				}
			}else if (sx.equals("f")|| (sx.equals("F"))) {
				pi = 52 + (0.67*(a-152.4));
				if (pi < p) {
					System.out.println("Abaixo do peso");
				}else if (pi == p) {
					System.out.println("Peso Ideal");
				}else {
					System.out.println("Acima do peso");
				}
			}
			System.out.println("Deseja continuar?? S ou N");
			r = in.next();
		}while (r.equals("S")|| (r.equals("s")));
		in.close();
	}
} 
