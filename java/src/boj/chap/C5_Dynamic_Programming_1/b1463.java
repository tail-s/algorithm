package boj.chap.C5_Dynamic_Programming_1;

import java.util.Scanner;

public class b1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[] dp = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            dp[i] = i % 3 == 0 ? Math.min(dp[i / 3], dp[i - 1]) + 1 : dp[i - 1] + 1;
            dp[i] = i % 2 == 0 ? Math.min(dp[i / 2] + 1, dp[i]) : dp[i];
        }

        System.out.println(dp[N]);
    }
}
