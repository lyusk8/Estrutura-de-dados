package br.com.letscode;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numeros = {64, 7, 25, 12, 3, 11, 2, 15, 5};
        selectSort(numeros);
    }

    private static void selectSort(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (var j = i + 1; j < numeros.length; j++) {
                int menor;
                if (numeros[j] < numeros[i]) {
                    menor = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = menor;
                }
            }

        }

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

}
