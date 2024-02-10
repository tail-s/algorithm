package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        for (int i=1; i<=N; i++) arr[i] = i;
        int i, j, tmp;
        while (M-- > 0) {
            i = sc.nextInt();
            j = sc.nextInt();
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        sc.close();
        for (int k=1; k<=N; k++) System.out.print(arr[k] + " ");

    }
}
