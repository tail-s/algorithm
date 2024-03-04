package boj.lev.L12_브루트_포스;

import java.util.Scanner;

public class b2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int ans = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                ans += N / 5;
                break;
            }
            else if (N >= 3) {
                N -= 3;
                ans++;
            }
            else {
                ans = -1;
                break;
            }
        }
        System.out.println(ans);
    }
}

