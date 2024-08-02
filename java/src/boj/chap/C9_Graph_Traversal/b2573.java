package boj.chap.C9_Graph_Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class b2573 {
    static int N, M;
    static int[][] map;
    static int[][] drc = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };
    static boolean[][] visited;
    static boolean out(int r, int c) { return r < 0 || c < 0 || r >= N || c >= M || visited[r][c]; }

    static int count() {
        int result = 0;
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) for (int j = 0; j < M; j++) {
            if (map[i][j] == 0 || visited[i][j]) continue;
            dfs(i, j);
            result++;
        }

        return result;
    }

    static void dfs(int r, int c) {
        visited[r][c] = true;
        for (int k = 0; k < 4; k++) {
            int tr = r + drc[k][0];
            int tc = c + drc[k][1];
            if (out(tr, tc)) continue;
            dfs(tr, tc);
        }
    }

    static void bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) for (int j = 0; j < M; j++) if ()

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map = new int[N][M];
        for (int i = 0; i < N; i++) map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();



    }
}
