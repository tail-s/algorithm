package boj.chap.C7_Two_Pointer;

import java.util.Scanner;

public class b21921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) { arr[i] = sc.nextInt(); }
        sc.close();

        int s = 0, e = X, val = 0;
        for (int i = 0; i < e; i++) val += arr[i];
        int ans = val;
        int cnt = 1;

        while (e < N) {
            val += arr[e];
            val -= arr[s];
            e++;
            s++;
            if (val > ans) {
                ans = val;
                cnt = 1;
            } else if (val == ans) cnt++;
        }
        if (ans == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(ans + "\n" + cnt);
        }
    }

}
