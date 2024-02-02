package softeer.Lv1;

import java.io.*;
import java.util.*;

public class 개표 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for (int tc = 1; tc<=T; tc++) {
            int n = sc.nextInt();

            while (n >= 5) {
                sb.append("++++ ");
                n -= 5;
                if (n == 0) sb.setLength(sb.length() - 1);
            }
            while (n-- > 0) sb.append("|");
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
