package boj.chap.C5_Dynamic_Programming_1;

import java.util.Scanner;
// 다시 풀어보기
public class b9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        String[] dp = new String[1001];
        dp[1] = "SK";
        dp[2] = "CY";
        dp[3] = "SK";
        for (int i=4; i<=N; i++) {
            if (i >= 3 && dp[i-1-1].equals("SK")) dp[i] = "SK";
            else if (i >= 5 && dp[i-3-1].equals("SK")) dp[i] = "SK";
            else if (i >= 7 && dp[i-3-3].equals("SK")) dp[i] = "SK";
            else dp[i] = "CY";
        }
        System.out.println(dp[N]);



    }
}
