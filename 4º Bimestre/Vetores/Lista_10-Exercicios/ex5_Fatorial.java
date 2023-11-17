public class ex5_Fatorial {
	public static void main(String[] args) {
		// Criar um vetor A com 15 elementos inteiros (exemplo)
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // Inicializar o vetor B com o mesmo tamanho que A
        int[] B = new int[A.length];

        // Calcular o fatorial de cada elemento em A e armazená-lo em B
        for (int i = 0; i < A.length; i++) {
            int numero = A[i];
            int fatorial = 1;
            for (int j = 1; j <= numero; j++) {
                fatorial *= j;
            }
            B[i] = fatorial;
        }

        // Imprimir os vetores A e B
        System.out.println("Vetor A: " + java.util.Arrays.toString(A));
        System.out.println("Vetor B (fatoriais de A): " + java.util.Arrays.toString(B));
    }
}