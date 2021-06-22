package br.com.letscode;

public class MergeSort {

    public static void main(String[] args) {

        int[] numeros = {78, 67, 34, 89, 56, 23, 12,90,45};

        mergeSort(numeros.length, numeros);

        for(int x : numeros) {
            System.out.print(x + " ");
        }

    }

    private static void mergeSort(int tamanho, int[] vetor) {
        int elementos = 1;
        int inicio, meio, fim;

        while(elementos < tamanho) {
            inicio = 0;

            while(inicio + elementos < tamanho) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;

                if(fim > tamanho)
                    fim = tamanho;

                intercala(vetor, inicio, meio, fim);
                inicio = fim;
            }
            elementos = elementos * 2;
        }

    }

    private static void intercala(int[] vetor, int inicio, int meio, int fim) {

        int novoVetor[] = new int[fim - inicio];
        int i = inicio;
        int m = meio;
        int pos = 0;

        while(i < meio && m < fim) {
            if(vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos ++;
                i ++;
            } else {
                novoVetor[pos] = vetor[m];
                pos++;
                m ++;
            }
        }

        while(i < meio) {
            novoVetor[pos] = vetor[i];
            pos ++;
            i ++;
        }

        while(m < fim) {
            novoVetor[pos] = vetor[m];
            pos ++;
            m ++;
        }

        for(pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }
}
