package boj.lev.L9_약수_배수와_소수;

import java.util.Scanner;

public class b2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int cnt = 0, ans = 0;
        for (int i=1; i<=N; i++)
            if (N % i == 0) {
                cnt++;
                if (cnt == K) {
                    ans = i;
                    break;
                }
            }
        System.out.println(ans);
    }
}
