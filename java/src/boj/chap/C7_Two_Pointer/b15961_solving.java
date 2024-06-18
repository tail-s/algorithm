package boj.chap.C7_Two_Pointer;

import java.util.Scanner;

public class b15961_solving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[2 * N];
        for (int i = 0; i < N; i++) { arr[i] = sc.nextInt(); }
        for (int i = 0; i < N; i++) { arr[N + i] = arr[i]; }
        sc.close();

        int s = 0, e = 0;
        while (e < 2 * N) {


        }



    }
}
