package boj.lev.L13_정렬;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class b25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<N; i++) pq.offer(sc.nextInt());
        sc.close();

        int cnt = 0, ans = 0;
        while (!pq.isEmpty() && cnt++ != k) ans = pq.poll();

        System.out.println(ans);

    }
}
