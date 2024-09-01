package boj.chap.C10_Brute_Force;

import java.util.Scanner;

public class b2961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < (1 << N); i++) {
            int sour = 1;
            int bitter = 0;

            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) != 0) {
                    sour *= arr[j][0];
                    bitter += arr[j][1];
                }
            }

            int diff = Math.abs(sour - bitter);
            ans = Math.min(ans, diff);
        }

        System.out.println(ans);

    }
}