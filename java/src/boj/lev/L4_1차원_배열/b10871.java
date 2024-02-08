package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int tmp;

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            tmp = sc.nextInt();
            if (tmp < X) sb.append(tmp + " ");
        }
        sc.close();
        sb.setLength(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
