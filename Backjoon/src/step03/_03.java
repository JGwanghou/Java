package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/21
 * 이름: 조광호
 * 내용: 백준 3단계 3번 문제. 합
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		
	}
}
