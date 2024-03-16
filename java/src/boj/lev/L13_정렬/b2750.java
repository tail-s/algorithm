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
//        Arrays.sort(arr);

        // Counting Sort O(n) : 빠르지만 수열의 길이보다 수의 범위가 극단적으로 크면 메모리 낭비가 될 수 있다.
        int[] counting = new int[2001]; // 수의 범위 -1000 ~ 1000
        int[] result = new int[N];

        for (int i=0; i<N; i++) counting[arr[i]+1000]++;    // arr의 값을 index로 하는 counting 배열 값 증가
        for (int i=1; i<2001; i++) counting[i] += counting[i-1];   // 누적 합 처리
        for (int i=N-1; i>=0; i--) {
            int val = arr[i]+1000;
            counting[val]--;
            result[counting[val]] = val-1000;
        }
        for (int i=0; i<N; i++) arr[i] = result[i];





        for (int i : arr) sb.append(i).append("\n");
        System.out.println(sb);


    }
}
