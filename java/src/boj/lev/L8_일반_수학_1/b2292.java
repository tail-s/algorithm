package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int ans = 1, cnt = 1;
        N--;
        while (cnt <= N) {
            cnt += 6 * ans;
            ans++;
        }

        System.out.println(ans);
    }
}
