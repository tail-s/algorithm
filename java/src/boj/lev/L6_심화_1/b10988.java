package boj.lev.L6_심화_1;

import java.util.Scanner;

public class b10988 {
    public static int check(String str) {
        int result = -1;
        StringBuilder sb = new StringBuilder();
        if (str.equals(sb.append(str).reverse().toString())) result = 1;
        else result = 0;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(check(sc.next()));
        sc.close();

    }
}
