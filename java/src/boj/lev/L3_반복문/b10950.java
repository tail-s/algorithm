package boj.lev.L3_반복문;

import java.util.Scanner;

public class b10950 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();

        int A, B;
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            A = sc.nextInt();
            B = sc.nextInt();
            sb.append(A + B).append("\n");
        }
        sc.close();
        System.out.println(sb.toString());

    }
}
