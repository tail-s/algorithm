package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b6443 {
    public static int N, M;
    public static int[] arr, ans;
    public static StringBuilder sb = new StringBuilder();
    public static void dfs(int depth) {
        if (depth == M) {
            for (int i : ans) sb.append((char) (i + 'a'));
            sb.append("\n");
            return;
        }
        for (int i=0; i<26; i++) {
            if (arr[i] == 0) continue;
            ans[depth] = i;
            arr[i]--;
            dfs(depth+1);
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        String word;
        while (N-- > 0) {
            word = sc.next();
            M = word.length();

            arr = new int[26];
            ans = new int[M];

            for (int i=0; i<M; i++) arr[word.charAt(i) - 'a']++;
            dfs(0);
        }
        System.out.println(sb);
    }
}
