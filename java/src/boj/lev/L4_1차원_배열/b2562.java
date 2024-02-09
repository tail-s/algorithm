package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = -1, idx = -1;
        for (int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                idx = i + 1;
            }
        }
        sc.close();
        System.out.println(max + "\n" + idx);


    }
}
