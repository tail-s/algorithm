import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] p;
    static void make(int n) {
        p = new int[n+1];
        for (int i=1; i<=n; i++) p[i] = i;
    }
    static int find(int n) {
        if (p[n] == n) return n;
        return p[n] = find(p[n]);
    }

    static boolean union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb) return false;
        p[rb] = ra;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> knows = new HashSet<>();
        int[][] party;
        int N, M, know;

        N = sc.nextInt();
        M = sc.nextInt();
        know = sc.nextInt();
        if (know > 0) for (int i=0; i<know; i++) knows.add(sc.nextInt());

        party = new int[M][];
        for (int i=0; i<M; i++) {
            party[i] = new int[sc.nextInt()];
            for (int j=0; j<party[i].length; j++) party[i][j] = sc.nextInt();
        }
        sc.close();

        make(N);
        for (int i : knows) union(0, i);

        int cnt = 2;
        while (cnt-- > 0)
        for (int i=0; i<M; i++) for (int j=0; j<party[i].length - 1; j++) union(party[i][0], party[i][j+1]);
















































































    }
}