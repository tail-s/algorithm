package boj.lev.L1_입출력과_사칙연산;

import java.util.Scanner;

public class b1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        sc.close();
        double result = A / B;
        System.out.println(result);
    }
}
