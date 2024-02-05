package boj.lev.L2_조건문;

import java.util.Scanner;

public class b2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int minute = H * 60 + M - 45;
        if (minute < 0) minute += 24 * 60;
        H = minute / 60;
        M = minute % 60;
        System.out.println(H + " " + M);
    }
}
