package boj.chap.C1_Data_Structure;

import java.util.*;

public class b1966 {
    public static class Docs {
        int priority, no;
        public Docs(int pri, int no) {
            this.priority = pri;
            this.no = no;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        Deque<Docs> deq = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        int N, M, no;
        while (tc-- > 0) {
            deq.clear();
            pq.clear();
            N = sc.nextInt();
            M = sc.nextInt();
            no = 0;
            for (int i=0; i<N; i++) {
                deq.offer(new Docs(sc.nextInt(), no++));
                pq.offer(!deq.isEmpty() ? deq.peekLast().priority : 10);
            }

            no = 1;
            while (!deq.isEmpty()) {
                Docs docs = deq.poll();
                if (!pq.isEmpty() && pq.peek() == docs.priority) {
                    if (docs.no == M) break;
                    pq.poll();
                    no++;
                }
                else {
                    deq.offer(docs);
                }
            }
            sb.append(no).append("\n");
        }
        System.out.println(sb);

    }
}
