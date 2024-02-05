package boj.lev.L2_조건문;

import java.util.Scanner;

public class b2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int minute = A * 60 + B + C;
        A = minute / 60;
        B = minute % 60;
        if (A > 23) A -= 24;
        System.out.println(A + " " + B);
    }
}
