package boj.lev.L2_조건문;

import java.util.Scanner;

public class b2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int ans = 0;
        if (A == B && B == C) ans = 10000 + A * 1000;
        else if (A == B || B == C || C == A) {
            if (A == B) ans = 1000 + A * 100;
            else ans = 1000 + C * 100;
        } else ans = Math.max(A, Math.max(B, C)) * 100;
        System.out.println(ans);
    }
}
