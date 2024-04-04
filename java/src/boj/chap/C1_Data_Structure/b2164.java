package boj.chap.C1_Data_Structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class b2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=1; i<=N; i++) deque.offer(i);

        while (deque.size() > 1) {
            deque.poll();
            deque.offer(deque.poll());
        }
        System.out.println(deque.poll());

    }
}
