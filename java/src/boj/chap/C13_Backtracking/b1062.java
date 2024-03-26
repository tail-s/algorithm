package boj.chap.C13_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b1062 {
    public static int N, K, ans = 0;
    public static String[] words;
    public static boolean[] arr = new boolean[26];
    public static Set<Character> set = new HashSet<>();
    public static void dfs(int depth, int start) {
        if (depth == K) {
            int cnt = 0;
            for (int i=0; i<N; i++) {
                boolean flag = true;
                for (int j=0; j<words[i].length(); j++) {
                    if (arr[words[i].charAt(j) - 'a']) continue;
                    flag = false;
                    break;
                }
                if (flag) cnt++;
            }
            ans = Math.max(ans, cnt);
            return;
        }

        for (int i=start; i<26; i++) {
            if (arr[i]) continue;
            arr[i] = true;
            dfs(depth+1, i+1);
            arr[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        words = new String[N];
        for (int i=0; i<N; i++) {
            String str = br.readLine().replaceAll("anta|tica", "");
            words[i] = str;
        }
        br.close();

        if (K < 5) {
            System.out.println(0);
        } else if (K >= 26) {
            System.out.println(N);
        } else {
            String target = "acint";
            for (int i=0; i<target.length(); i++) arr[target.charAt(i) - 'a'] = true;
            K -= 5;
            dfs(0, 0);
            System.out.println(ans);
        }

    }
}
