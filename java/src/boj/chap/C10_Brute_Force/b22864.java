package boj.chap.C10_Brute_Force;

import java.util.Scanner;

public class b22864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int p = 0, w = 0;
        for (int i=0; i<24; i++) {
            if (p + A <= M) {
                p += A;
                w += B;
            } else {
                p -= p - C < 0 ? p : C;
            }
        }
        System.out.println(w);
    }
}
