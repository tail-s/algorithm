package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b11005 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        while (N != 0) {
            sb.append(N % B < 10 ? (char) (N % B + '0') : (char) (N % B - 10 + 'A'));
            N /= B;
        }

        System.out.println(sb.reverse());

    }
}
