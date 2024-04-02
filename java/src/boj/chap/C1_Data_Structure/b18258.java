package boj.chap.C1_Data_Structure;

import java.util.Scanner;

public class b18258 {

    static class MyQueue {
        int size, front, back;
        int[] q = new int[2000000];
        public MyQueue() {
            this.size = 0;
            this.front = 0;
            this.back = 0;
        }

        void push(int x) {
            q[back++] = x;
            size++;
        }
        int pop() {
            if (size == 0) return -1;
            else {
                size--;
                return q[front++];
            }
        }

        int size() { return size; }

        int empty() {
            if (size == 0) return 1;
            else return 0;
        }

        int front() {
            if (size == 0) return -1;
            else return q[front];
        }

        int back() {
            if (size == 0) return -1;
            else return q[back - 1];
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        MyQueue q = new MyQueue();
        String order;
        int x;

        while (N-- > 0) {
            order = sc.next();
            switch (order) {
                case "push":
                    x = sc.nextInt();
                    q.push(x);
                    break;
                case "pop":
                    sb.append(q.pop()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.empty()).append("\n");
                    break;
                case "front":
                    sb.append(q.front()).append("\n");
                    break;
                case "back":
                    sb.append(q.back()).append("\n");
            }
        }
        sc.close();

        System.out.println(sb);


    }
}
