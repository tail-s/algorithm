package boj.lev.L2_조건문;

import java.util.Scanner;

public class b9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        char ch = '\u0000';
        if (score > 89) ch = 'A';
        else if (score > 79) ch = 'B';
        else if (score > 69) ch = 'C';
        else if (score > 59) ch = 'D';
        else ch = 'F';

        System.out.println(ch);
    }
}
