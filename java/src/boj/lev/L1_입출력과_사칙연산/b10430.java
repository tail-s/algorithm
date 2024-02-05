package boj.lev.L1_입출력과_사칙연산;

import java.util.Scanner;

public class b10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        sb.append(
                (A+B)%C + "\n" +
                        ((A%C) + (B%C))%C + "\n" +
                        (A*B)%C + "\n" +
                        ((A%C) * (B%C))%C
        );
        System.out.println(sb.toString());
    }
}
