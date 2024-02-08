package boj.lev.L3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a, b;
        String str;
        while ( (str = br.readLine()) != null) {
            a = str.charAt(0) - '0';
            b = str.charAt(2) - '0';
            if (a + b == 0) break;
            sb.append(a + b).append("\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
}
