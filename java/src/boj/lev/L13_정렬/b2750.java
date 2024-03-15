package boj.lev.L13_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class b2750 {
    static int N;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i=0; i<N; i++) arr[i] = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder();

        // 선택정렬 O(n^2)
//        for (int i=0; i<N-1; i++)
//            for (int j=i+1; j<N; j++)
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = tmp;
//                }

        // Arrays.sort O(nlong) ~ O(n^2) : dual-pivot Quicksort
        Arrays.sort(arr);

        for (int i : arr) sb.append(i).append("\n");
        System.out.println(sb);


    }
}
