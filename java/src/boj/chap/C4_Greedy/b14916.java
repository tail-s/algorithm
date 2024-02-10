package boj.chap.C4_Greedy;

import java.util.Scanner;

public class b14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int coin2 = 0, coin5 = 0;

        while (n > 1) {
            if (n % 5 != 0) coin2++;
            else {
                coin5 = n / 5;
                break;
            }
            n -= 2;
        }
        System.out.println(n != 1 ? coin2 + coin5 : -1);

    }
}
