package boj.lev.L10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class b9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int x, y;
        for (int i=0; i<N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        sc.close();

        int ans = (maxY - minY) * (maxX - minX);
        System.out.println(N == 1 ? 0 : ans);
    }
}
