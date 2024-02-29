package boj.lev.L10_기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a, b, c;
        String ans;
        while (true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) break;

            ans = "";

            if (!((a + b > c) && (b + c > a) && (c + a > b))) ans = "Invalid";
            else if (a == b && b == c) ans = "Equilateral";
            else if (a == b || b == c || c == a) ans = "Isosceles";
            else ans = "Scalene";
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
