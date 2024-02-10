package boj.lev.L4_1차원_배열;

import java.util.Scanner;

public class b5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[30];
        for (int i=0; i<28; i++) arr[sc.nextInt() - 1] = true;
        sc.close();
        for (int i=0; i<30; i++) if (!arr[i]) sb.append(i+1).append("\n");
        System.out.println(sb);
    }
}
