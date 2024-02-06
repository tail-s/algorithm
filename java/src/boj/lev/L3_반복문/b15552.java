package boj.lev.L3_반복문;

import java.io.*;
import java.util.StringTokenizer;

public class b15552 {

    public static int stoi(String str) { return Integer.parseInt(str); }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            sb.append(stoi(st.nextToken()) + stoi(st.nextToken())).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
