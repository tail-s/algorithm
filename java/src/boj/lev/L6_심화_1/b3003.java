package boj.lev.L6_심화_1;

import java.util.Scanner;

public class b3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] ans = new int[6];

        for (int i=0; i<arr.length; i++) ans[i] = arr[i] - sc.nextInt();
        sc.close();
        for (int i : ans) System.out.print(i + " ");
    }
}
