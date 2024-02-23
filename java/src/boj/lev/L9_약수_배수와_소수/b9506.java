package boj.lev.L9_약수_배수와_소수;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class b9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q;
        int n, sum;

        while (true) {
            n = sc.nextInt();
            if (n == -1) break;
            q = new ArrayDeque<>();
            sum = 0;

            for (int i=1; i<n; i++) if (n % i == 0) q.offer(i);
            for (int i : q) sum += i;
            if (sum != n) sb.append(n + " is NOT perfect.\n");
            else {
                sb.append(n + " = ");
                while (!q.isEmpty()) sb.append(q.poll() + " + ");
                sb.setLength(sb.length() - 3);
                sb.append("\n");
            }
        }
        sc.close();
        System.out.println(sb);
    }
}
