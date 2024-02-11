package boj.lev.L5_문자열;

import java.util.Scanner;

public class b2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();

        int n;
        String str;
        while (T-- > 0) {
            n = sc.nextInt();
            str = sc.next();
            for (int i=0; i<str.length(); i++) for (int j=0; j<n; j++) sb.append(str.charAt(i));
            sb.append("\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
