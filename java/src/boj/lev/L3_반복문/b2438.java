package boj.lev.L3_반복문;

import java.util.Scanner;

public class b2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i=0; i<N; i++) {
            for (int j=i; j>=0; j--) System.out.print("*");
            System.out.println();
        }
    }
}
