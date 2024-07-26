package boj.chap.C8_Implementation;

import java.util.Scanner;

public class b15787 {
    static int N, M;
    static int[][] train;
    static Scanner sc = new Scanner(System.in);
    static void execute() {
        int i, x;
        while (M-- > 0) {
            switch (sc.nextInt()) {
                case 1:
                    i = sc.nextInt();
                    x = sc.nextInt();
                    train[i][x] = 1;
                    break;
                case 2:
                    i = sc.nextInt();
                    x = sc.nextInt();
                    train[i][x] = 0;
                    break;
                case 3:
                    i = sc.nextInt();
                    for (int j = 19; j > 0; j--) train[i][j] = train[i][j - 1];
                    break;
                case 4:

            }
        }
    }
    public static void main(String[] args) {
        N = sc.nextInt();
        M = sc.nextInt();
        train = new int[N + 1][20];



    }
}
