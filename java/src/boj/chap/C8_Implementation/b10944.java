package boj.chap.C8_Implementation;

import java.util.Scanner;

public class b10944 {
    static int N;
    static boolean[][] paper;
    static StringBuilder sb = new StringBuilder();
    static void marking(int x) {
        for (int i = x; i < N - x; i++) {
            paper[i][x] = true;
            paper[x][i] = true;
            paper[N - x - 1][i] = true;
            paper[i][N - x - 1] = true;
        }
    }
    static void drawing() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) sb.append(paper[i][j] ? "*" : " ");
            sb.append("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();

        paper = new boolean[4 * (N - 1) + 1][4 * (N - 1) + 1];
        for (int i = 0; i < 2 * N; i+=2) marking(i);
        drawing();

        System.out.println(sb);


    }
}
