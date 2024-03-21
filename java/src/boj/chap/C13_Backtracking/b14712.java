package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b14712 {
    static int N, M, ans = 0;
    static boolean[][] map;
    static StringBuilder sb = new StringBuilder();
    static void dfs(int depth) {
        if (depth == N * M) {
            ans++;
            return;
        }

        int r = depth / M + 1;
        int c = depth % M + 1;

        if (map[r-1][c-1] && map[r-1][c] && map[r][c-1]) {
            dfs(depth+1);
        } else {
            // 위 로직에서 2*2 네모를 만들지 않고 넘어가야 하기 때문에 true인 상태에서 먼저 dfs를 진행
            map[r][c] = true;
            dfs(depth+1);
            map[r][c] = false;
            dfs(depth+1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.close();
        map = new boolean[N+1][M+1];

        dfs(0);

        System.out.println(ans);

    }
}
