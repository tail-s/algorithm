package boj.lev.L8_일반_수학_1;

import java.util.Scanner;

public class b1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        int layer = 1, L = -1, R = -1;
        while (X > layer) {
            X -= layer;
            layer++;
        }

        boolean flag = layer % 2 == 0;

        R = flag ? layer - X + 1 : X;
        L = flag ? X : layer - X + 1;
        System.out.println(L + "/" + R);
    }
}
