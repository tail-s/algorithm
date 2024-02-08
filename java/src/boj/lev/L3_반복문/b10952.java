package boj.lev.L3_반복문;

import java.util.Scanner;

public class b10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a, b;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a + b == 0) break;
            sb.append(a + b).append("\n");
        }
        sc.close();
        System.out.println(sb.toString());
    }
}
