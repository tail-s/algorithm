package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b14888 {
    public static int N, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    public static int[] arr, ops = new int[4];
    public static int cal(int value, int ops, int target) {
        int result = value;
        switch (ops) {
            case 0:
                result += target;
                break;
            case 1:
                result -= target;
                break;
            case 2:
                result *= target;
                break;
            case 3:
                result /= target;
        }
        return result;
    }
    public static void dfs(int depth, int value) {
        if (depth == N-1) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for (int i=0; i<4; i++) {
            if (ops[i] > 0) {
                ops[i]--;
                dfs(depth+1, cal(value, i, arr[depth+1]));
                ops[i]++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i=0; i<N; i++) arr[i] = sc.nextInt();
        for (int i=0; i<4; i++) ops[i] = sc.nextInt();
        sc.close();

        dfs(0, arr[0]);
        System.out.println(max + "\n" + min);

    }
}
