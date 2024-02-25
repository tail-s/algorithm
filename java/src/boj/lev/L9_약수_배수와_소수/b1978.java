package boj.lev.L9_약수_배수와_소수;

import java.util.Scanner;

public class b1978 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i=2; i*i<=n; i++) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0, tmp;
        while (N-- > 0) cnt += isPrime(sc.nextInt()) ? 1 : 0;
        sc.close();
        System.out.println(cnt);
    }
}
