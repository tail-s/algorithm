package boj.lev.L11_시간_복잡도;

import java.util.Scanner;

public class b24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        sc.close();

        System.out.println(a1 * n0 + a0 <= c * n0 && a1 <= c ? 1 : 0);
        
    }
}
