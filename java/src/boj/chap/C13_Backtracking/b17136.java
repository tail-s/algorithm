package boj.chap.C13_Backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class b17136 {
    public static int ans = Integer.MAX_VALUE;
    public static int[] arr = {5, 5, 5, 5, 5};
    public static boolean[][] map = new boolean[10][10];
    public static boolean stickable(int r, int c, int size) {
        for (int i=r; i<=r+size; i++) for (int j=c; j<=c+size; j++) if (map[i][j]) return false;
        return true;
    }
    public static void dfs(int depth, int cnt) {
        if (cnt >= ans) return;
        if (depth == 100) {
            boolean flag= true;
            verify:
            for (int i=0; i<10; i++) for (int j=0; j<10; j++) if (!map[i][j]) {
                flag = false;
                break verify;
            }
            if (flag) ans = cnt;
            return;
        }

        int r = depth / 10;
        int c = depth % 10;

        if (map[r][c]) dfs(depth + 1, cnt);
        else {
            for (int i=4; i>=0; i--) {
                if (arr[i] == 0 || r + i >= 10 || c + i >= 10 || !stickable(r, c, i)) continue;
                arr[i]--;
                for (int j=r; j<=r+i; j++) for (int k=c; k<=c+i; k++) map[j][k] = true;
                dfs (depth + 1, cnt + 1);
                arr[i]++;
                for (int j=r; j<=r+i; j++) for (int k=c; k<=c+i; k++) map[j][k] = false;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for (int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<10; j++) map[i][j] = Integer.parseInt(st.nextToken()) == 0;
        }

        dfs(0, 0);
        ans = ans == Integer.MAX_VALUE ? -1 : ans;
        bw.write(ans + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
