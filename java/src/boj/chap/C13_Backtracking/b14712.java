package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b14712 {
    static int N, M, ans = 0;
    static boolean[][] map;
    static StringBuilder sb = new StringBuilder();
    static void dfs(int r, int c) {
        if (r == N) {
            ans++;
            return;
        }

        int tr = c + 1 == M ? r + 1 : r;
        int tc = c + 1 == M ? 0 : c + 1;

        if (r-1>=0 && c-1>=0 && map[r-1][c-1] && map[r-1][c] && map[r][c-1]) {
            dfs(tr, tc);
            return;
        }

        // 위 로직에서 2*2 네모를 만들지 않고 넘어가야 하기 때문에 true인 상태에서 먼저 dfs를 진행
        map[r][c] = true;
        dfs(tr, tc);
        map[r][c] = false;
        dfs(tr, tc);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.close();
        map = new boolean[N][M];

        dfs(0, 0);

        System.out.println(ans);

    }
}
