package boj.chap.C5_Dynamic_Programming_1;

import java.util.Scanner;

public class b9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt(), n;
        int[] dp;
        while (T-- > 0) {
            n = sc.nextInt();
            dp = new int[n + 4];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            sb.append(dp[n]).append("\n");
        }
        sc.close();
        System.out.println(sb);

    }
}
