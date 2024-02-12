package boj.lev.L7_2차원_배열;

import java.util.Scanner;

public class b2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] arr = new boolean[101][101];
        int a, b;
        while (N-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int i=a; i<a+10; i++)
                for (int j=b; j<b+10; j++)
                    arr[i][j] = true;
        }
        sc.close();

        int ans = 0;
        for (int i=1; i<101; i++)
            for (int j=1; j<101; j++)
                if (arr[i][j]) ans++;
        System.out.println(ans);

    }
}
