package boj.chap.C4_Greedy;

import java.util.Scanner;

public class b2138 {
    public static int calculate(int cnt, int width) {
        int result = 0;

        switch (cnt) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String start = sc.next();
        String end = sc.next();
        sc.close();

        int cnt=0, left, right, ans = 0;
        for (int i=0; i<N; i++) {
            if (start.charAt(i) != end.charAt(i)) {
                cnt++;
                continue;
            }
            else {
                if (cnt != 0) {
                    if (cnt == 2 && (i-1) % 2 == 1 && (N-i) % 2 == 1) {
                        ans = -1;
                        break;
                    }
                    // 저장하는 로직
                }
                cnt = 0;
            }

            if ()
        }
        System.out.println(ans);


    }
}
