package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/27
 * 이름: 조광호
 * 내용: 백준 3단계 11번 문제. X보다 작은 수 출력
 */
public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < N; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
