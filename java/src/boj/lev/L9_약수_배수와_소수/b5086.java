package boj.lev.L9_약수_배수와_소수;

import java.util.Scanner;

public class b5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A, B;
        boolean flag1, flag2;
        while (true) {
            A = sc.nextInt();
            B = sc.nextInt();
            if (A == 0 && B == 0) break;
            flag1 = B % A == 0;
            flag2 = A % B == 0;
            sb.append(!(flag1 || flag2) ? "neither" : flag1 ? "factor" : "multiple").append("\n");
        }
        sc.close();
        System.out.println(sb);

    }
}
