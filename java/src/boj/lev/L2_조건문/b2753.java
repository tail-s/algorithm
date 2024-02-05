package boj.lev.L2_조건문;

import java.util.Scanner;

public class b2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();

        int ans = -1;
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ans = 1;
        else ans = 0;
        System.out.println(ans);
    }
}
