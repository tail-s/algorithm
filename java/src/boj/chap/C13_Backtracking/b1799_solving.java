package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b1799_solving {
    public static int N, ans = Integer.MIN_VALUE;
    public static boolean[][] map;
    public static boolean[][] visited;
    public static boolean isPossible(int r, int c, int depth) {
        if (!map[r][c]) return false;
        for (int i=0; i<depth; i++) {
            int tr = i / N;
            int tc = i % N;
            if (visited[tr][tc] && Math.abs(r - tr) == Math.abs(c - tc)) return false;
        }
        return true;
    }

    public static void dfs(int depth, int cnt) {
//        if (N * N - depth + cnt <= ans) return;
        if (depth >= N * N) {
//            ans = cnt;
            ans = Math.max(ans, cnt);
            return;
        }

        int r = depth / N;
        int c = depth % N;

        if (isPossible(r, c, depth)) {
            visited[r][c] = true;
            dfs(depth + 1, cnt + 1);
            visited[r][c] = false;
            dfs(depth + 1, cnt);
        }
        else dfs(depth + 1, cnt);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new boolean[N][N];
        visited = new boolean[N][N];
        for (int i=0; i<N; i++) for (int j=0; j<N; j++) map[i][j] = sc.nextInt() == 1;
        sc.close();

        dfs(0, 0);
        System.out.println(ans);

    }
}
