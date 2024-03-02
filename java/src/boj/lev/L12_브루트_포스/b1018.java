package boj.lev.L12_브루트_포스;

import java.util.Scanner;

public class b1018 {

    public static int ans = Integer.MAX_VALUE, N, M;
    public static char[][] map;
    public static char[] setA = new char[] {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
    public static char[] setB = new char[] {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};

    public static void check() {
        int cnt = 0;

        for (int i=0; i<N-7; i++)
            for (int j=0; j<M-7; j++) {
                                                
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new char[N][M];

        for (int i=0; i<N; i++) map[i] = sc.next().toCharArray();
        sc.close();




    }
}
