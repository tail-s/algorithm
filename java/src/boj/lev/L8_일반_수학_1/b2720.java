package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        int C;
        while (T-- > 0) {
            C = sc.nextInt();
            sb.append(C / 25).append(" ");
            C %= 25;
            sb.append(C / 10).append(" ");
            C %= 10;
            sb.append(C / 5).append(" ");
            C %= 5;
            sb.append(C).append("\n");
        }
        sc.close();

        System.out.println(sb);

    }
}
