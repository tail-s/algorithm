package boj.chap.C13_Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class b15655 {
    
    public static int N, M;
    public static int[] arr, ans;
    public static StringBuilder sb = new StringBuilder();
    public static void dfs(int depth, int start) {
        if (depth == M) {
            for (int i=0; i<M; i++) sb.append(ans[i] + " ");
            sb.setLength(sb.length()-1);
            sb.append("\n");
            return;
        }

        for (int i=start; i<N; i++) {
            ans[depth] = arr[i];
            dfs(depth+1, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        ans = new int[N];
        for (int i=0; i<N; i++) arr[i] = sc.nextInt();
        sc.close();

        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);



    }
}
