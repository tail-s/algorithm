package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b2661 {
    public static int N;
    public static void dfs(String str) {
        if (str.length() == N) {
            System.out.println(str);
            System.exit(0);
        }

        for (int i=1; i<=3; i++) {
            if (check(str + String.valueOf(i))) dfs(str + String.valueOf(i));
        }
    }
    public static boolean check(String str) {
        int range = str.length() / 2;

        for (int i=1; i<=range; i++) {
            if (str.substring(str.length() - i).equals(str.substring(str.length() - 2 * i, str.length() - i))) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();

        dfs("");


    }
}
