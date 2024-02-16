package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b2745 {
    public static int changer(char ch) {
        return ch >= 'A' ? ch - 'A' + 10 : ch - '0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char ch = sc.next().charAt(0);
        int B = changer(ch);
        sc.close();

        double ans = 0, target;
        for (int i=0; i<N.length(); i++) {
            target = changer(N.charAt(N.length() - 1 - i));
            ans += Math.pow(B, i) * target;
        }

        System.out.println(Math.pow(36, 1));
    }
}
