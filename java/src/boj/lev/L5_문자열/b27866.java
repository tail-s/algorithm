package boj.lev.L5_문자열;

import java.util.Scanner;

public class b27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = sc.nextInt();
        sc.close();
        System.out.println(S.charAt(i - 1));
    }
}
