package boj.lev.L12_브루트_포스;

import java.util.Scanner;

public class b1018 {

    public static int ans = Integer.MAX_VALUE, N, M;
    public static char[][] map;
    public static char[] setA = new char[] {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
    public static char[] setB = new char[] {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};

    public static void check(int r, int c) {
        int cnt = 0;

        for (int i=r; i<r+8; i++)
            for (int j=c; j<c+8; j++)
                cnt += i % 2 == 0 ? map[i][j] != setA[j-c] ? 1 : 0 : map[i][j] != setB[j-c] ? 1 : 0;

        ans = Math.min(ans, cnt);
        cnt = 0;

        for (int i=r; i<r+8; i++)
            for (int j=c; j<c+8; j++)
                cnt += i % 2 == 0 ? map[i][j] != setB[j-c] ? 1 : 0 : map[i][j] != setA[j-c] ? 1 : 0;

        ans = Math.min(ans, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new char[N][M];

        for (int i=0; i<N; i++) map[i] = sc.next().toCharArray();
        sc.close();

        for (int i=0; i<N-7; i++)
            for (int j=0; j<M-7; j++)
                check(i, j);

        System.out.println(ans);

    }
}
