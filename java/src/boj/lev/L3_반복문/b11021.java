package boj.lev.L3_반복문;

import java.util.Scanner;

public class b11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=T; i++) sb.append("Case #" + i + ": " + (sc.nextInt() + sc.nextInt())).append("\n");
        sc.close();

        System.out.println(sb.toString());
    }
}
