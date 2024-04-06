package boj.chap.C5_Dynamic_Programming_1;

import java.util.Arrays;
import java.util.Scanner;

public class b2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[] sugar = new int[5001];
        Arrays.fill(sugar, Integer.MAX_VALUE);
        sugar[3] = 1;
        sugar[5] = 1;
        int tmp;
        for (int i=6; i<=N; i++) {
            tmp = Math.min(sugar[i-3], sugar[i-5]);
            sugar[i] = tmp == Integer.MAX_VALUE ? tmp : tmp + 1;
        }
        System.out.println(sugar[N] == Integer.MAX_VALUE ? -1 : sugar[N]);
    }
}
