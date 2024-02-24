import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=N; i++) sb.append(i).append("\n");
        System.out.println(sb);


    }
}