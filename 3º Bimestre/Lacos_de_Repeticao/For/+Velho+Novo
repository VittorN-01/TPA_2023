import java.util.Scanner;
public class ex4_VelhoNovo {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	
	int i, n, v, an, aa, id; 
	
	System.out.print("Ano de Nascimento: ");
	an = in.nextInt();
	System.out.println("Ano Atual: ");
	aa = in.nextInt();
	id = aa - an;
	n = id;
	v = id;
		for (i=2; i <=10; i++) {
			System.out.print("Ano de Nascimento: ");
			an = in.nextInt();
			System.out.println("Ano Atual: ");
			aa = in.nextInt();
			id = aa - an;
				if (id>= n) {
					v = id;
			}else if (id <=v) {
				n = id;
			}
			System.out.println("+velho "+v+" +novo "+n);
			in.close();
		}
	}
}
