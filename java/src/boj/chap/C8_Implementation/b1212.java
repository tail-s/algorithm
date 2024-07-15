package boj.chap.C8_Implementation;

import java.util.Scanner;

public class b1212 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        String tmp;
        for (int i = 0; i < str.length(); i++) {
            tmp = Integer.toBinaryString(str.charAt(i) - '0');

            if (i == 0) sb.append(tmp);
            else sb.append(String.format("%03d", Integer.parseInt(tmp)));
        }

        System.out.println(sb);
    }
}