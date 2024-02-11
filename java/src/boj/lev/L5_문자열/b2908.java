package boj.lev.L5_문자열;

import java.util.Scanner;

public class b2908 {
    public static StringBuilder sb;
    public static int trans(String str) {
        sb = new StringBuilder();
        return Integer.parseInt(sb.append(str).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        System.out.println(Math.max(trans(a), trans(b)));
    }
}
