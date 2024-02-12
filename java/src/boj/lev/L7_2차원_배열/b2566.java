package boj.lev.L7_2차원_배열;

import java.util.Scanner;

public class b2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tr = -1, tc = -1, max = -1, tmp;

        for (int i=0; i<9; i++)
            for (int j=0; j<9; j++) {
                tmp = sc.nextInt();
                if (tmp > max) {
                    max = tmp;
                    tr = i + 1;
                    tc = j + 1;
                }
            }

        sc.close();
        System.out.print(max + "\n" + tr + " " + tc);
    }
}
