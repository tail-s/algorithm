package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] arr = new float[N];

        float max = -1;
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextFloat();
            max = Math.max(max, arr[i]);
        }
        for (int i=0; i<N; i++) arr[i] = arr[i]/max*100;

        float ans = 0;
        for (float i : arr) ans += i;
        System.out.println(ans / N);
//        System.out.println(String.format("%.2f", ans / N));

    }
}
