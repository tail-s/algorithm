package boj.lev.L5_문자열;

import java.util.Arrays;
import java.util.Scanner;

public class b10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        String str = sc.next();
        sc.close();

        int tmp;
        for (int i=0; i<str.length(); i++) {
            tmp = str.charAt(i) - 'a';
            if (arr[tmp] == -1) arr[tmp] = i;
        }
        for (int i : arr) System.out.print(i + " ");
    }
}
