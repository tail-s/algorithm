package boj.lev.L3_반복문;

import java.util.Scanner;

public class b11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A, B;

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            sb.append("Case #" + i + ": " + A + " + " + B + " = " + (A + B)).append("\n");
        }
        sc.close();

        System.out.println(sb.toString());
    }
}
