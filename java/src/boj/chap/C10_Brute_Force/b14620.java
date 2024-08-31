package boj.chap.C10_Brute_Force;

import java.util.Scanner;

public class b14620 {
    static int N;
    static int[][] cost;
    static int[][] drc = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };
    static boolean out(int r, int c) { return r < 0 || c < 0 || r >= N || c >= N; }
    static boolean[][] visited;

    static void solve() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        cost = new int[N][N];
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) cost[i][j] = sc.nextInt();
        sc.close();
        visited = new boolean[N][N];

        solve();

    }
}
