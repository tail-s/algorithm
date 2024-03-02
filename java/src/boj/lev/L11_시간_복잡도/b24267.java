package boj.lev.L11_시간_복잡도;

import java.util.Scanner;

public class b24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        System.out.println((n-2)*(n-1)*n/6);
        System.out.println(3);
    }
}
