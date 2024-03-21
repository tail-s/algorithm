package boj.chap.C13_Backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class b3980 {
    public static int C, max;
    public static int[][] stat;
    public static boolean[] visited;
    public static void dfs(int depth, int score) {
        if (max >= score + (11 - depth) * 100) return;  // 별 차이 없음
        if (depth == 11) {
            max = Math.max(max, score);
            return;
        }
        for (int i=0; i<11; i++) {
            if (visited[i] || stat[depth][i] == 0) continue;
            visited[i] = true;
            dfs(depth+1, score+stat[depth][i]);
            visited[i] = false;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        C = Integer.parseInt(br.readLine());
        while (C-- > 0) {
            stat = new int[11][11];
            visited = new boolean[11];
            max = -1;
            for (int i=0; i<11; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<11; j++) stat[i][j] = Integer.parseInt(st.nextToken());
            }
            dfs(0, 0);
            sb.append(max).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
