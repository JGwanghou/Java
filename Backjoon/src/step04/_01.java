package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜: 2022/09/02
 * 이름: 조광호
 * 내용: 백준 4단계 1번 문제. 최소 최대
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}

}
