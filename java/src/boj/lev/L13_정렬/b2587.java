package boj.lev.L13_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class b2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++) arr[i] = sc.nextInt();
        sc.close();

        Arrays.sort(arr);
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println(sum / 5);
        System.out.println(arr[5 / 2]);


    }
}
