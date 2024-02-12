package boj.lev.L7_2차원_배열;

import java.util.Scanner;

public class b2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int[][] ans = new int[N][M];

        for (int i=0; i<N; i++)
            for (int j=0; j<M; j++)
                arr[i][j] = sc.nextInt();

        for (int i=0; i<N; i++)
            for (int j=0; j<M; j++)
                ans[i][j] = arr[i][j] + sc.nextInt();

        sc.close();

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }

    }
}
