package boj.lev.L3_반복문;

import java.util.Scanner;

public class b25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for (int i=0; i<N; i++) sum += sc.nextInt() * sc.nextInt();
        sc.close();
        System.out.println(X == sum ? "Yes" : "No");
    }
}
