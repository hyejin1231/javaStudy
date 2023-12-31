package code.test.ch06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ch06. Sorting and Searching(정렬, 이분검색과 결정알고리즘)
 * : 이분 검색
 *
 * 설명
 * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
 *
 * 입력
 * 첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
 * 두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.
 *
 * 출력
 * 첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.
 *
 * 예시 입력 1
 * 8 32
 * 23 87 65 12 57 32 99 81
 *
 * 예시 출력 1
 * 3
 */
public class SearchForTwoPeople
{
	public static void main(String[] args)
	{
		SearchForTwoPeople searchForTwoPeople = new SearchForTwoPeople();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i ++)
		{
			arr[i] = scanner.nextInt();
		}
		int result = searchForTwoPeople.solution(n, m, arr);
		System.out.print(result);
		
		System.out.println();
		int result2 = searchForTwoPeople.solution2(n, m, arr);
		System.out.println("result2 = " + result2);
		
	}
	
	public int solution(int n, int m, int[] arr)
	{
		int answer = 0;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i ++)
		{
			if (arr[i] == m) {
				return i + 1;
			}
		}
		
		return answer;
	}
	
	// 이분 검색을 이용하는 풀이!! (내가 한 풀이는 시간 복잡도가 O(n)
	public int solution2(int n, int m, int[] arr)
	{
		int answer = 0;
		Arrays.sort(arr); // 이분 검색은 정렬을 기반으로 해야함
		
		int lt = 0, rt = n-1;
		while (lt <= rt)
		{
			int mid = (lt + rt) / 2;
			
			if (arr[mid] == m) {
				answer = mid + 1;
				break;
			}
			
			if (arr[mid] > m) {
				rt = mid-1;
			}else {
				lt = mid + 1;
			}
		}
		
		return answer;
	}
	
}
