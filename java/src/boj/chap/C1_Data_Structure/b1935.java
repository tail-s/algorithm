package boj.chap.C1_Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class b1935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String target = sc.next();

        int[] value = new int[N];
        for (int i=0; i<N; i++) value[i] = sc.nextInt();
        sc.close();

        Stack<Double> stack = new Stack<>();
        for (int i=0; i<target.length(); i++) {
            char ch = target.charAt(i);
            if (ch >= 'A' && ch <= 'Z') stack.push((double) value[ch - 'A']);
            else {
                double b = stack.pop();
                double a = stack.pop();
                switch (ch) {
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));




    }
}
