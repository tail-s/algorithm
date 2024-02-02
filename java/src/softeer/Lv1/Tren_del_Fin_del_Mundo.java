package softeer.Lv1;

import java.util.Scanner;

public class Tren_del_Fin_del_Mundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x, y, ansX = -1, ansY = Integer.MAX_VALUE;
        N = sc.nextInt();
        while (N-- > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (y < ansY) {
                ansX = x;
                ansY = y;
            }
        }
        sc.close();
        System.out.println(ansX + " " + ansY);
    }
}
