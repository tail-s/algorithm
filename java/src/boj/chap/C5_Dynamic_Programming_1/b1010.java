package boj.chap.C5_Dynamic_Programming_1;

import java.util.Scanner;

public class b1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N, M;
        StringBuilder sb = new StringBuilder();

        int[][] dp = new int[30][30];
        for (int i=0; i<30; i++) for (int j=0; j<=i; j++) {
            if (j == 0 || j == i) dp[i][j] = 1;
            else dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
        }
        while (T-- > 0) {
            N = sc.nextInt();
            M = sc.nextInt();
            sb.append(dp[M][N]).append("\n");
        }
        sc.close();
        sb.setLength(sb.length() - 1);
        System.out.println(sb);

    }
}
