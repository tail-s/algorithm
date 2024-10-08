package boj.chap.C8_Implementation;

import java.util.Scanner;
import java.util.Stack;

public class b4396 {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int[][] drc = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1} };
    static char[][] target;
    static char[][] map;
    static boolean out(int r, int c) { return r < 0 || r >= n || c < 0 || c >= n; }

    static void solve() {
        int size = 0;
        boolean flag = false;
        Stack<int[]> s = new Stack<>();
        while (size < n * n) {
            int r = size / n;
            int c = size % n;

            if (target[r][c] == '*') {
                s.push(new int[]{r, c});
                if (!flag && map[r][c] == 'x') flag = true;
            } else if (map[r][c] == 'x') {
                int cnt = 0;
                for (int i = 0; i < 8; i++) {
                    int tr = r + drc[i][0];
                    int tc = c + drc[i][1];
                    if (out(tr, tc)) continue;
                    if (target[tr][tc] == '*') cnt++;
                }
                map[r][c] = Character.forDigit(cnt, 10);
            }
            size++;
        }

        if (flag) {
            while (!s.isEmpty()) {
                int[] point = s.pop();
                map[point[0]][point[1]] = '*';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) sb.append(map[i][j]);
            sb.append("\n");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        target = new char[n][n];
        map = new char[n][n];
        for (int i = 0; i < n; i++) target[i] = sc.next().toCharArray();
        for (int i = 0; i < n; i++) map[i] = sc.next().toCharArray();

        solve();

        System.out.println(sb);
    }
}
