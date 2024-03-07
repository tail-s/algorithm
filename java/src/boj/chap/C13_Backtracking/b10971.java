package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b10971 {
    public static int N, ans = Integer.MAX_VALUE;
    public static int[][] W;
    public static boolean[] visited;
    public static void dfs(int depth, int location, int cost, int home) {
        if (cost >= ans) return;

        if (depth == N-1) {
            if (W[location][home] != 0) ans = Math.min(ans, cost + W[location][home]);
            return;
        }

        for (int i=0; i<N; i++) {
            if (visited[i] || W[location][i] == 0) continue;
            visited[i] = true;
            dfs(depth+1, i, cost+W[location][i], home);
            visited[i] = false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = new int[N][N];
        for (int i=0; i<N; i++) for (int j=0; j<N; j++) W[i][j] = sc.nextInt();
        sc.close();

        for (int i=0; i<N; i++) {
            visited = new boolean[N];
            visited[i] = true;
            dfs(0, i, 0, i);
        }
        System.out.println(ans);

    }
}
