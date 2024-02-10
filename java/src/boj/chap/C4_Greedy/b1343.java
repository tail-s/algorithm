package boj.chap.C4_Greedy;

import java.util.Scanner;

public class b1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        str = str.replaceAll("XXXX", "AAAA");
        str = str.replaceAll("XX", "BB");
        boolean flag = true;
        for (char ch : str.toCharArray()) {
            if (ch == 'X') {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? str : -1);
    }
}
