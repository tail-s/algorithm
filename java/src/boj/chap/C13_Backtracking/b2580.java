package boj.chap.C13_Backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class b2580 {
    public static int[][] map = new int[9][9];
    public static void tracking(int depth) {
        if (depth == 81) {
            for (int i=0; i<9; i++) {
                System.out.println();
                for (int j=0; j<9; j++) System.out.print(map[i][j] + " ");
            }
            System.exit(0);
        }

        int tr = depth / 9;
        int tc = depth % 9;

        if (map[tr][tc] == 0) {
            for (int i=1; i<=9; i++) if (check(tr, tc, i)) {
                map[tr][tc] = i;
                tracking(depth + 1);
            }
            map[tr][tc] = 0;
        } else {
            tracking(depth + 1);
        }
    }
    public static boolean check(int r, int c, int val) {
        for (int i=0; i<9; i++) if (map[r][i] == val) return false;
        for (int i=0; i<9; i++) if (map[i][c] == val) return false;

        int tr = r / 3 * 3;
        int tc = c / 3 * 3;
        for (int i=tr; i<tr+3; i++) for (int j=tc; j<tc+3; j++) if (map[i][j] == val) return false;

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        tracking(0);

    }
}
