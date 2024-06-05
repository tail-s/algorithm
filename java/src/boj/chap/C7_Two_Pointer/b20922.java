package boj.chap.C7_Two_Pointer;

import java.util.Scanner;

public class b20922 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) { arr[i] = sc.nextInt(); }
        sc.close();

        int s = 0, e = 0, ans = 0;
        int[] cnt = new int[100001];
        while (e < N) {
            cnt[arr[e]]++;
            while (cnt[arr[e]] > K) {
                cnt[arr[s++]]--;
            }
            e++;
            ans = Math.max(ans, e - s);
        }

        System.out.println(ans);

    }
}
