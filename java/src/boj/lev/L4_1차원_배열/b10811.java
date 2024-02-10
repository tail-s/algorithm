package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        for (int i=1; i<=N; i++) arr[i] = i;

//        int[] tmp;
        int tmp;

        int i, j;
        while (M-- > 0) {
            i = sc.nextInt();
            j = sc.nextInt();

//            tmp = new int[j-i+1];
//            for (int k=0; k<=j-i; k++) tmp[k] = arr[j-k];
//            for (int k=i; k<=j; k++) arr[k] = tmp[k-i];
            for (int k=0; k<(j-i+1)/2; k++) {
                tmp = arr[i+k];
                arr[i+k] = arr[j-k];
                arr[j-k] = tmp;
            }

        }
        sc.close();
        for (int k=1; k<=N; k++) System.out.print(arr[k] + " ");
    }
}
