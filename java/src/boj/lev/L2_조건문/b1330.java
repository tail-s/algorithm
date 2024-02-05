package boj.lev.L2_조건문;

import java.util.Scanner;

public class b1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        String result = "";
        if (A > B) result = ">";
        else if (A < B) result = "<";
        else result = "==";

        System.out.println(result);
    }
}
