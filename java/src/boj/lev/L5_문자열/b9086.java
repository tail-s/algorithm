package boj.lev.L5_문자열;

import java.util.Scanner;

public class b9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        String str;
        while (T-- > 0) {
            str = sc.next();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
