package boj.lev.L3_반복문;

import java.util.Scanner;

public class b25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        int cnt = N / 4;
        while (cnt-- > 0) sb.append("long ");
        sb.append("int");
        System.out.println(sb.toString());
    }
}
