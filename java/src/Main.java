import java.util.*;
// https://www.acmicpc.net/problem/20164
public class Main {
    static int ans = 0;
    static void dfs(int target, int sum) {
        if (target / 10 == 0) return;

        int cnt = 0;
        for (int i = 0; i < String.valueOf(target).length(); i++) {
            if (Character.forDigit(String.valueOf(target).charAt(i), 10) % 2 == 1) cnt++;
        }

        if (target / 100 == 0) dfs(target / 10 + target % 10, sum + cnt);
        else {
            for (int i = 0; i < String.valueOf(target).length(); i++) {
                for (int j = 0; j < String.valueOf(target).length() - 1; j++) {
                    // 이게 맞나...
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.close();

        dfs(target, 0);
        System.out.println(ans);

    }
}