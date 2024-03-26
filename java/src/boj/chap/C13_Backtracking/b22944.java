package boj.chap.C13_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b22944 {
    public static int N, H, D, K, s_r, s_c, e_r, e_c, ans = Integer.MAX_VALUE;
    public static char[][] map;
    public static boolean[] visited;
    public static List<int[]> umbrella = new ArrayList<>();
    public static void dfs(int depth, int step, int r, int c, int hp, int u) {
        int end = Math.abs(e_r - r) + Math.abs(e_c - c);
        if (step + end >= ans) return;
        if (end <= hp + u) {
            ans = Math.min(ans, step + Math.abs(e_r - r) + Math.abs(e_c - c));
            return;
        }
        if (depth == K+1) return;


        for (int i=0; i<K; i++) {
            if (visited[i]) continue;
            int[] target = umbrella.get(i);
            int dist = Math.abs(target[0] - r) + Math.abs(target[1] - c);
            if (dist > hp + u) continue;
            visited[i] = true;
            int thp = 0;
            if (u >= dist) {
                thp = hp;
            } else {
                thp = hp + u - dist;
            }
            dfs(depth+1, step + Math.abs(target[0] - r) + Math.abs(target[1] - c), target[0], target[1], thp, D);
            visited[i] = false;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = sc.nextInt();
        D = sc.nextInt();
        map = new char[N][N];

        for (int i=0; i<N; i++) {
            String str = sc.next();
            for (int j=0; j<N; j++) {
                map[i][j] = str.charAt(j);
                if (map[i][j] == 'S') {
                    s_r = i;
                    s_c = j;
                } else if (map[i][j] == 'E') {
                    e_r = i;
                    e_c = j;
                } else if (map[i][j] == 'U') {
                    umbrella.add(new int[]{i, j});
                }
            }
        }

        sc.close();

        K = umbrella.size();
        visited = new boolean[K];

        dfs(0, 0, s_r, s_c, H, 0);
        ans = ans == Integer.MAX_VALUE ? -1 : ans;
        System.out.println(ans);




    }
}
