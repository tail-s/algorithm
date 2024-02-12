package boj.lev.L7_2차원_배열;

import java.util.Scanner;

public class b10798 {
    public static boolean verify(char ch) {
        if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z'))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];
        String str;
        for (int i=0; i<5; i++) {
            str = sc.next();
            for (int j=0; j<str.length(); j++) arr[i][j] = str.charAt(j);
        }
        sc.close();

        char ch;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<15; i++)
            for (int j=0; j<5; j++) {
                ch = arr[j][i];
                if (verify(ch)) sb.append(ch);
            }
        System.out.println(sb.toString());
    }
}
