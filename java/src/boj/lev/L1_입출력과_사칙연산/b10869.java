package boj.lev.L1_입출력과_사칙연산;

import java.util.Scanner;

public class b10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(
                (A + B) + "\n" +
                (A - B) + "\n" +
                (A * B) + "\n" +
                (A / B) + "\n" +
                (A % B));
    }
}
