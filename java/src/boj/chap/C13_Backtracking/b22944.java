package boj.chap.C13_Backtracking;

import java.util.Scanner;

public class b22944 {
    public static int N, H, D;
    public static char[][] map;
    public static List<int[]> 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = sc.nextInt();
        D = sc.nextInt();
        map = new char[N][N];

        for (int i=0; i<N; i++) {
            String str = sc.next();
            for (int j=0; j<N; j++) {
                map[i][j] = str.charAt(j);
                if (map[i][j] == 'E')
            }
        }

        sc.close();




    }
}
