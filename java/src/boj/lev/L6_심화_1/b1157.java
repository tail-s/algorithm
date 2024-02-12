package boj.lev.L6_심화_1;

import java.util.Scanner;

public class b1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] target = sc.next().toUpperCase().toCharArray();
        sc.close();

        int max = -1;
        int idx = -1;
        boolean flag = false;
        int[] arr = new int[26];
        for (char ch : target) arr[ch - 'A']++;
        for (int i=0; i<26; i++) {
            if (arr[i] == max) flag = true;
            else if (arr[i] > max) {
                flag = false;
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(flag ? "?" : (char) (idx + 'A'));


    }
}
