package boj.lev.L10_기하_직사각형과_삼각형;

import java.util.Scanner;

public class b3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i=0; i<6; i++) arr[i] = sc.nextInt();
        sc.close();

        int x, y;
        x = arr[0] != arr[2] ? arr[0] != arr[4] ? arr[0] : arr[2] : arr[4];
        y = arr[1] != arr[3] ? arr[1] != arr[5] ? arr[1] : arr[3] : arr[5];

        System.out.println(x + " " + y);
    }
}
