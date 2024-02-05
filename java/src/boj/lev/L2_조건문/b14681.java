package boj.lev.L2_조건문;

import java.util.Scanner;

public class b14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int ans = -1;
        if (x > 0) {
            if (y > 0) ans = 1;
            else ans = 4;
        }
        else {
            if (y > 0) ans = 2;
            else ans = 3;
        }
        System.out.println(ans);
    }
}
