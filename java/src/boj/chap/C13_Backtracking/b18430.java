package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b18430 {
    public static int N, M, ans = 0;
    public static int[][] wood;
    public static boolean[][] visited;
    public static void dfs(int depth, int strength) {
        if (depth == N * M) {
            ans = Math.max(ans, strength);
            return;
        }

        int r = depth / M;
        int c = depth % M;

        if (r+1 < N && c+1 < M && !visited[r][c] && !visited[r][c+1] && !visited[r+1][c]) {
            visited[r][c] = visited[r][c+1] = visited[r+1][c] = true;
            dfs(depth + 1, strength + wood[r][c] * 2 + wood[r+1][c] + wood[r][c+1]);
            visited[r][c] = visited[r][c+1] = visited[r+1][c] = false;
        }

        if (r+1 < N && c-1 >= 0 && !visited[r][c] && !visited[r][c-1] && !visited[r+1][c]) {
            visited[r][c] = visited[r][c-1] = visited[r+1][c] = true;
            dfs(depth + 1, strength + wood[r][c] * 2 + wood[r][c-1] + wood[r+1][c]);
            visited[r][c] = visited[r][c-1] = visited[r+1][c] = false;
        }

        if (r-1 >= 0 && c-1 >= 0 && !visited[r][c] && !visited[r][c-1] && !visited[r-1][c]) {
            visited[r][c] = visited[r][c-1] = visited[r-1][c] = true;
            dfs(depth + 1, strength + wood[r][c] * 2 + wood[r][c-1] + wood[r-1][c]);
            visited[r][c] = visited[r][c-1] = visited[r-1][c] = false;
        }

        if (r-1 >= 0 && c+1 < M && !visited[r][c] && !visited[r-1][c] && !visited[r][c+1]) {
            visited[r][c] = visited[r-1][c] = visited[r][c+1] = true;
            dfs(depth + 1, strength + wood[r][c] * 2 + wood[r-1][c] + wood[r][c+1]);
            visited[r][c] = visited[r-1][c] = visited[r][c+1] = false;
        }

        dfs(depth + 1, strength);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        wood = new int[N][M];
        visited = new boolean[N][M];
        for (int i=0; i<N; i++) for (int j=0; j<M; j++) wood[i][j] = sc.nextInt();
        sc.close();

        dfs(0, 0);
        System.out.println(ans);

    }
}
