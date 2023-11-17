import java.util.Scanner;
public class ex4_Potencia {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		final int TAM = 11;
		int a[], i, exp;
		double res;
		
		a = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
            System.out.print("Digite o valor do expoente " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            exp = a[i];
            res = calcularPotencia(2, exp);
            System.out.println("2 elevado a " + exp + " é igual a " + res);
        }in.close();
    }
		 public static double calcularPotencia(double base, int expoente) {
		        if (expoente < 0) {
		            return 1.0 / calcularPotencia(base, -expoente);
		        } else if (expoente == 0) {
		            return 1;
		        } else {
		            double resultado = 1.0;
		            for (int i = 1; i <= expoente; i++) {
		                resultado *= base;
		            }
		            return resultado;
		        }
	}
}
