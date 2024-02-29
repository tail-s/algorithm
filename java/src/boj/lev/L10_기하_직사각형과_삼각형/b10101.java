package boj.lev.L10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class b10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        boolean error = A + B + C != 180;
        boolean equilateral = A == 60 && B == 60 && C == 60;
        boolean isosceles = A == B || B == C || A == C;

        String ans;
        if (error) ans = "Error";
        else if (equilateral) ans = "Equilateral";
        else if (isosceles) ans = "Isosceles";
        else ans = "Scalene";

        System.out.println(ans);
    }
}
