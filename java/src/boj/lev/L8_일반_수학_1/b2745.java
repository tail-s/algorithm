package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b2745 {
    public static int changer(char ch) {
        return ch >= 'A' ? ch - 'A' + 10 : ch - '0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        sc.close();

        int ans = 0;
        for (int i=0; i<N.length(); i++) {
            ans += changer(N.charAt(N.length() - 1 - i)) * (int) Math.pow(B, i);
        }

        System.out.println(ans);


    }
}
