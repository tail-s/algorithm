package boj.chap.C1_Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class b9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        int stack;
        char[] arr;
        boolean flag;

        while (T-- > 0) {
            arr = sc.next().toCharArray();
            stack = 0;
            flag = true;
            for (char ch : arr) {
                if (ch == '(') stack++;
                else {
                    if (stack == 0) {
                        flag = false;
                        break;
                    }
                    else stack--;
                }
            }
            sb.append(!flag || stack > 0 ? "NO" : "YES").append("\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
