package boj.lev.L13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());
        br.close();

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i : arr) sb.append(i).append("\n");
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
