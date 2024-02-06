package boj.lev.L3_반복문;

import java.util.Scanner;

public class b2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<10; i++) sb.append(N + " * " + i + " = " + N * i + "\n");
        System.out.println(sb.toString());
    }
}
