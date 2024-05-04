package boj.chap.C5_Dynamic_Programming_1;

import java.util.Scanner;

public class b10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] arr = new int[n + 2];
        arr[1] = 1;

        for (int i=2; i<=n; i++) arr[i] = arr[i-2] + arr[i-1];

        System.out.println(arr[n]);



    }
}
