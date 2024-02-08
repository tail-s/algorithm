package boj.lev.L4_1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int tmp, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            tmp = Integer.parseInt(st.nextToken());
            max = Math.max(tmp, max);
            min = Math.min(tmp, min);
        }
        br.close();

        System.out.println(min + " " + max);

    }
}
