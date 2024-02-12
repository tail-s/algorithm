package boj.lev.L6_심화_1;

import java.util.Scanner;

public class b25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sub;
        double score;
        String grade;
        double sum = 0;
        int total = 0;

        for (int i=0; i<20; i++) {
            sub = sc.next();
            score = sc.nextDouble();
            grade = sc.next();

            switch (grade) {
                case "A+":
                    sum += 4.5 * score;
                    total += score;
                    break;
                case "A0":
                    sum += 4.0 * score;
                    total += score;
                    break;
                case "B+":
                    sum += 3.5 * score;
                    total += score;
                    break;
                case "B0":
                    sum += 3.0 * score;
                    total += score;
                    break;
                case "C+":
                    sum += 2.5 * score;
                    total += score;
                    break;
                case "C0":
                    sum += 2.0 * score;
                    total += score;
                    break;
                case "D+":
                    sum += 1.5 * score;
                    total += score;
                    break;
                case "D0":
                    sum += 1.0 * score;
                    total += score;
                    break;
                case "F":
                    total += score;

            }

        }
        sc.close();
        System.out.println(sum / total);
    }
}
