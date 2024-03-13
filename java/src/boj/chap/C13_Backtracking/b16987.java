package boj.chap.C13_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b16987 {
    public static int N, ans = Integer.MAX_VALUE;
    public static List<Egg> eggs = new ArrayList<>();
    public static boolean isEnd() {
        boolean result = true;
        int cnt = 0;
        for (int i=0; i<N; i++) {
            if (eggs.get(i).hp > 0) cnt++;
            if (cnt > 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static class Egg {
        int hp, wei;
        public Egg(int hp, int wei) {
            this.hp = hp;
            this.wei = wei;
        }
    }
    public static void dfs(int depth, int cnt) {
        if (cnt >= ans) return;
        if (isEnd()) {
            ans = cnt;
            return;
        }
        if (eggs.get(depth).hp <= 0) dfs(depth+1, cnt);

        Egg selected = eggs.get(depth), target;

        for (int i=0; i<N; i++) {
            if (depth == i || eggs.get(i).hp <= 0) continue;
            target = eggs.get(i);

            selected.hp -= target.wei;
            target.hp -= selected.wei;
            if (selected.hp > target.wei) {
                dfs(depth, cnt+1);
            } else {
                dfs(depth+1, cnt+1);
            }
            selected.hp += target.wei;
            target.hp += selected.wei;

        }


    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i=0; i<N; i++) eggs.add(new Egg(sc.nextInt(), sc.nextInt()));
        sc.close();

        dfs(0, 0);
        System.out.println(ans);


    }
}
