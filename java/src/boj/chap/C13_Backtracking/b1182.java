package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b1182 {
    public static int N, S, ans = 0;
    public static int[] arr;
    public static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) ans++;
            return;
        }

        dfs(depth+1, sum+arr[depth]);
        dfs(depth+1, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        arr = new int[N];
        for (int i=0; i<N; i++) arr[i] = sc.nextInt();
        sc.close();

        dfs(0, 0);
        if (S == 0) ans--;  // 공집합 고려
        System.out.println(ans);

    }
}
