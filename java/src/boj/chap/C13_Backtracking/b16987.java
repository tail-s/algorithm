package boj.chap.C13_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Now Solving
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
    public static void dfs(int depth, int cnt) {
        if (depth == N) {
            ans = Math.max(ans, cnt);
            return;
        }

//        if (eggs.get(depth).hp <= 0) {
//            dfs(depth+1, cnt);

//            return;
//        }

        Egg selected = eggs.get(depth), target;
        int broken;

        for (int i=0; i<N; i++) {
            if (eggs.get(i).hp <= 0) continue;
            target = eggs.get(i);

            selected.hp -= target.wei;
            target.hp -= selected.wei;

            broken = 0;
            if (target.hp <= 0) broken++;
            if (selected.hp <= 0) {
                broken++;
                dfs(depth+1, cnt+broken);
                selected.hp += target.wei;
                target.hp += selected.wei;
            } else {
                dfs(depth, cnt+broken);
            }

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
