package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        sc.close();

        int cal = (V - A) / (A - B);
        int day = (V - A) % (A - B) == 0 ? cal + 1 : cal + 2;
        System.out.println(day);
    }
}
