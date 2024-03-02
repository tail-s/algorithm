package boj.lev.L10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class b14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int max = Math.max(a, Math.max(b, c)), others;
        if (max == a) others = b + c;
        else if (max == b) others = a + c;
        else others = a + b;

        while (max >= others) max--;

        System.out.println(max + others);

    }
}
