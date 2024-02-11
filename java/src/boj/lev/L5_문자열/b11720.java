package boj.lev.L5_문자열;

import java.util.Scanner;

public class b11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        String str = sc.next();
        sc.close();
        for (char ch : str.toCharArray()) ans += Character.getNumericValue(ch);
        System.out.println(ans);
    }
}
