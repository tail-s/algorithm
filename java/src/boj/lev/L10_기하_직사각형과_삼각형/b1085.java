package boj.lev.L10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class b1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();

        int ans = Math.min(Math.min(Math.abs(x - w), x), Math.min(Math.abs(y - h), y));
        System.out.println(ans);
    }
}
