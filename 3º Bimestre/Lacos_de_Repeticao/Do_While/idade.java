import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		int id;
		String r;
		
		do {
			System.out.println("Coloque a idade: ");
			id = ler.nextInt();
			if (id >= 18) {
				System.out.println("Maior de Idade");
			}else {
				System.out.println("Menor de Idade");
			}
			System.out.println("Deseja continuar: S= Sim, N= Não" );
			r = ler.next();
		}while (r.equals("S")|| (r.equals("s")));
		ler.close();
	}	
}
