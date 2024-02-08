package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[201];
        while (N-- > 0) arr[sc.nextInt() + 100]++;
        System.out.println(arr[sc.nextInt() + 100]);
        sc.close();
    }
}
