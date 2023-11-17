import java.util.Scanner;
public class percentualMencoes {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in); 
	int aluno, mb, b, r, i,total;
	double m1, m2, m3, m4;
	
		System.out.print("Quantidade de alunos:");
		aluno = in.nextInt();
		System.out.println("Notas MB: ");
		mb = in.nextInt();
		System.out.println("Notas B: ");
		b = in.nextInt();
		System.out.println("Notas R: ");
		r = in.nextInt();
		System.out.println("Notas I: ");
		i = in.nextInt();
		
		total = mb +b +r +i;
		switch (total) {
		case 0:
			System.out.println("Nenhum aluno na Sala!!");
			break;
		default:
			m1 = (double) mb/total*100;		
			m2 = (double) b/total*100;
			m3 = (double) r/total*100;
			m4 = (double) i/total*100;
			
			System.out.println("Percentual: "+m1+" %");
			System.out.println("Percentual: "+m2+" %");
			System.out.println("Percentual: "+m3+" %");
			System.out.println("Percentual: "+m4+" %");
		}
		in.close();
	}
		
}
