package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];
        int i, j, k;
        while (M-- > 0) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for (int l=i; l<=j; l++) arr[l] = k;
        }
        sc.close();

        for (int l=1; l<=N; l++) System.out.print(arr[l] + " ");
    }
}
