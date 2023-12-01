package code.test.ch08;

import java.util.Scanner;

/**
 * ch08. DFS, BFS 활용
 * : 합이 같은 부분집합 (DFS)
 *
 * 설명
 * N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
 * 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고,
 * 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
 * 둘로 나뉘는 두 부분집합은 서로소 집합이며,
 * 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.
 * 예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이
 * 16으로 같은 경우가 존재하는 것을 알 수 있다.
 *
 * 입력 설명
 * 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
 * 두 번째 줄에 집합의 원소 N개가 주어진다.
 * 각 원소는 중복되지 않는다.
 *
 * 출력 설명
 * 첫 번째 줄에 “YES" 또는 ”NO"를 출력한다.
 *
 * 입력 예제 1
 * 6
 * 1 3 5 6 7 10
 *
 * 출력 예제 1
 * YES
 */
public class SubsetsWithTheSameSum2
{
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr)
	{
		if (flag) return;
		if (sum > total/2) return;
		if (L == n) {
			if ((total- sum) == sum){
				flag = true;
				answer = "YES";
			}
		}else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
	}
	public static void main(String[] args)
	{
		SubsetsWithTheSameSum2 subsetsWithTheSameSum2 = new SubsetsWithTheSameSum2();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i <n; i++)
		{
			arr[i] = scanner.nextInt();
			total += arr[i];
		}
		
		
		subsetsWithTheSameSum2.DFS(0, 0, arr);
		System.out.println("answer = " + answer);
		
	}
}
