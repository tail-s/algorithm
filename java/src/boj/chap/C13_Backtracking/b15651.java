package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b15651 {
    public static int N, M;
    public static int[] answer;
    public static StringBuilder sb = new StringBuilder();
    public static void dfs(int depth) {
        if (depth == M) {
            for (int i=0; i<M; i++) {
                sb.append(answer[i] + " ");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
            return;
        }
        for (int i=1; i<=N; i++) {
            answer[depth] = i;
            dfs(depth+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.close();

        answer = new int[M];
        dfs(0);
        System.out.println(sb);

    }
}
