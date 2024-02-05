package boj.lev.L1_입출력과_사칙연산;

import java.util.Scanner;

public class b2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i=B.length()-1; i>=0; i--) sb.append(A * (B.charAt(i) - '0')).append("\n");
        sb.append(A*Integer.parseInt(B));
        System.out.println(sb.toString());
    }
}
