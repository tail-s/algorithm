package boj.lev.L6_심화_1;

import java.util.Scanner;

public class b2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        sc.close();

        String[] arr = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String target : arr) str = str.replace(target, "X");

        System.out.println(str.length());

    }
}
