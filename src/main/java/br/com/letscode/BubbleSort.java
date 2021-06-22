package br.com.letscode;

public class BubbleSort {

    public static void main(String[] args) {

        int[] num = {5,1,4,2,8};
        bubbleSort(num);

    }

    private static void bubbleSort(int[] num) {

        for(int i=0; i < num.length; i++){
            for(int j=0; j < num.length - 1; j++){
                int maior;
                if(num[j] > num[j+1]){
                    maior = num[j];
                    num[j] = num[j+1];
                    num[j+1] = maior;
                }
            }
        }

        System.out.println();
        for(int n : num){
            System.out.print(n);
        }
    }
}
