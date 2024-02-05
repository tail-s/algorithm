package boj.lev.L1_입출력과_사칙연산;

import java.util.Scanner;

public class b11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        sc.close();
        long result = A + B + C;
        System.out.println(result);
    }
}
