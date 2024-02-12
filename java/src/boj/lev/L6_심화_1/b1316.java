package boj.lev.L6_심화_1;

import java.util.Scanner;

public class b1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        boolean flag;
        boolean[] arr;
        char last;
        char[] input;

        while (N-- > 0) {

            flag = false;
            arr = new boolean[26];
            last = '\0';
            input = sc.next().toCharArray();

            for (char ch : input) {
                if (last == ch) continue;
                else if (!arr[ch - 'a']) {
                    arr[ch - 'a'] = true;
                    last = ch;
                }
                else {
                    flag = true;
                    break;
                }
            }

            ans += flag ? 0 : 1;

        }
        sc.close();
        System.out.println(ans);
    }
}
