package code.test.ch03;

import java.util.Scanner;

/**
 * ch03. Two Pointers, Sliding Window [효율성 : O(n^2) --> O(n)]
 * : 최대 매출
 *
 * 설명
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 * 12 1511 20 2510 20 19 13 15
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 * 여러분이 현수를 도와주세요.
 *
 * 입력
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 *
 * 출력
 * 첫 줄에 최대 매출액을 출력합니다.
 *
 * 예시 입력 1
 * 10 3
 * 12 15 11 20 25 10 20 19 13 15
 *
 * 예시 출력 1
 * 56
 */
public class MaximumSales {
    public static void main(String[] args) {
        MaximumSales maximumSales = new MaximumSales();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int result = maximumSales.solution(n, k, a);
        System.out.print(result);

        System.out.println();
        int result2 = maximumSales.solution3(n, k, a);
        System.out.println("result2 = " + result2);
    }

    // Sliding Window 알고리즘
    public int solution(int n, int k, int[] a) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i <= n - k; i++) {
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    sum += a[i + j];
                    max = sum;
                }
            }else {
                sum = sum - a[i - 1] + a[i + k - 1];
                max = Math.max(max, sum);
            }

        }
        return max;
    }

    public int solution2(int n, int k, int[] a) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a[i + j];
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    public int solution3(int n, int k, int[] arr) {
        int answer, sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
