package boj.chap.C1_Data_Structure;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class b1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        Queue<Integer> q = new ArrayDeque<>();
        for (int i=1; i<=N; i++) q.offer(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!q.isEmpty()) {
            for (int i=0; i<K-1; i++) if (!q.isEmpty()) q.offer(q.poll());
            sb.append(q.poll() + ", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(">");
        System.out.println(sb);


    }
}
