package boj.chap.C1_Data_Structure;

import java.util.Scanner;

public class b10828 {
    public static class MyStack {
        int top = -1;
        int[] arr = new int[10000];
        void push(int x) { arr[++top] = x; }
        int pop() { return top < 0 ? -1 : arr[top--]; }
        int size() { return top + 1; }
        int empty() { return top < 0 ? 1 : 0; }
        int top() { return top < 0 ? -1 : arr[top]; }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        String order;
        while (N-- > 0) {
            order = sc.next();
            switch (order) {
                case "push":
                    stack.push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.empty()).append("\n");
                    break;
                case "top":
                    sb.append(stack.top()).append("\n");
            }
        }
        sc.close();
        System.out.println(sb);

    }
}
