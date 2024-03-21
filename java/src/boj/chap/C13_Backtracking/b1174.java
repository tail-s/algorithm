package boj.chap.C13_Backtracking;

import java.util.*;

/**
 * 줄어드는 수 중 가장 큰 수는 '9876543210' 이다.
 *
 */
public class b1174 {
    public static int N;
    public static int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    public static List<Long> ans = new ArrayList<>();
    public static void dfs(int depth, Long val) {
        if (!ans.contains(val)) ans.add(val);
        if (depth >= 10) return;
        dfs(depth+1, (val*10)+arr[depth]);
        dfs(depth+1, val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();

        dfs(0, 0L);
        ans.sort(null);
        try {
            System.out.println(ans.get(N-1));
        } catch (Exception e) {
            System.out.println(-1);
        }
    }
}
