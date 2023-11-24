import java.util.Scanner;
public class Questão8 {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
		
		final int TAM = 50;
		int i, a[] = new int [TAM];
		int maior, menor, caro, barato, soma;
		double media;
		
	/*Inicializando*/
		maior  = 0;
		menor  = 0;
		caro   = 0;
		barato = 0;
		soma   = 0;
		media  = 0;
		
	/*Solicitando e Guardando informações*/
		for(i=0; i < TAM; i++) {
			System.out.print("Digite o preço do "+(i+1)+"º produto: ");
			a[i] = in.nextInt();
			if (a[i] > maior) {
                maior = a[i];
                caro = i + 1;
                menor = a[i];
			}
			if (a[i] < menor) {
                menor = a[i];
                barato = i + 1;
            }
			
		}
	/*Soma*/
		for(i = 0; i < TAM; i++) {
			soma = a[i] + soma;
		}
	/*Média*/
		media = (double) soma/TAM;
	/*Apresentação*/
		System.out.print("\nValor total: R$ "+(double)soma);
		System.out.print("\nMédia: R$ "+media);
		System.out.print("\nMais Caro: R$ " + (double)maior + " / Produto: " + caro);
		System.out.print("\nMais Barato: R$ " + (double)menor + " / Produto: " + barato);
	}
}
