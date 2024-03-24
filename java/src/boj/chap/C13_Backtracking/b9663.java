package boj.chap.C13_Backtracking;

import java.util.Scanner;

/**
 * 가로, 세로, 대각선 확인하며 N개를 배치
 * 가로줄마다 하나 씩 채운다고 가정, 세로, 양 쪽 대각선 총 3개 위치정보 확인
 *
 * x + y 값과 x - y 값의 동일 여부 -> 대각선 확인
 * 좌표값의 합, 차와 상관없이 그저 행의 값과 열의 값의 차가 같다면 동일한 대각선 상에 있다. <- 새로 확인한 점
 * 두 좌표간의 차로도 확인 가능
 */
public class b9663 {
    public static int N, ans = 0;
    public static int[] arr;
    public static void nQueen(int depth) {
        // 행에 퀸을 하나씩 채워 넣는다는 가정, 각 행에 모두 퀀을 배치했을 경우
        if (depth == N) {
            ans++;
            return;
        }

        for (int i = 0; i < N; i++) {   // 모든 열에 배치 가능 여부 검사
            arr[depth] = i;             // isPossible에서 검증
            if (isPossible(depth)) {
                nQueen(depth + 1);  // 다음 행으로
            }
        }

    }
    public static boolean isPossible(int depth) {
        for (int i=0; i < depth; i++) { // 현재까지의 행까지
            if (arr[depth] == arr[i]) return false; // 선택된 열 배치와 겹치는지 확인
            else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) return false;
            // 현재 선택된 행과 지금까지 선택된 행의 차 == 현재 선택된 열 - 지금까지 선택된 열 인지 확인.
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.close();

        arr = new int[N];
        nQueen(0);

        System.out.println(ans);

    }
}
