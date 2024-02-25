package boj.lev.L9_약수_배수와_소수;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class b11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

//        boolean[] arr = new boolean[N+1];
//        Arrays.fill(arr, true);
//        for (int i=2; i*i<=N; i++) if (arr[i]) for (int j=i*i; j<=N; j+=i) arr[j] = false;
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i=2; i<=N; i++) if (arr[i]) pq.offer(i);
//
//        StringBuilder sb = new StringBuilder();
//        int tmp = Integer.MAX_VALUE;
//        while (N > 1) {
//            if (!pq.isEmpty()) tmp = pq.poll();
//            while (N % tmp == 0) {
//                sb.append(tmp).append("\n");
//                N /= tmp;
//            }
//        }
//        System.out.println(sb);

        StringBuilder sb = new StringBuilder();
        for (int i=2; i*i<=N; i++) {
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }
        if (N != 1) sb.append(N);
        System.out.println(sb);
    }
}
