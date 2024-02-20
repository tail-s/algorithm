package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[] arr = new int[16];
        arr[0] = 2;
        for (int i=1; i<=N; i++) arr[i] = arr[i-1] * 2 - 1;
        System.out.println((int) Math.pow(arr[N], 2));

    }
}
