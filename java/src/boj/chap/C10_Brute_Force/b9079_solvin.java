package boj.chap.C10_Brute_Force;

import java.util.Scanner;

public class b9079_solvin {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        while (T-- > 0) {
            arr = new int[3][3];
            for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) arr[i][j] = sc.nextInt();

        }
        sc.close();
    }
}
