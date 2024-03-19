package boj.chap.C13_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b16987 {
    public static int N, ans = -1;
    public static List<Egg> eggs = new ArrayList<>();
    public static class Egg {
        int hp, wei;
        public Egg(int hp, int wei) {
            this.hp = hp;
            this.wei = wei;
        }
    }
    public static void dfs(int depth) {
        if (depth == N) {
            int cnt = 0;
            for (Egg egg : eggs) if (egg.hp <= 0) cnt++;
            ans = Math.max(ans, cnt);
            return;
        }

        Egg selected = eggs.get(depth), target;
        boolean noTarget = true;

        for (int i=0; i<N; i++) {
            target = eggs.get(i);
            if (i == depth || target.hp <= 0 || selected.hp <= 0) continue;
            noTarget = false;

            selected.hp -= target.wei;
            target.hp -= selected.wei;
            dfs(depth+1);
            selected.hp += target.wei;
            target.hp += selected.wei;
        }
        if (noTarget) dfs(depth+1);


    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i=0; i<N; i++) eggs.add(new Egg(sc.nextInt(), sc.nextInt()));
        sc.close();

        dfs(0);
        System.out.println(ans);


    }
}
