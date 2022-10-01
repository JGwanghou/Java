package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/21
 * 이름: 조광호
 * 내용: 백준 3단계 2번 문제. A+B
 */
public class _02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("테스트 케이스 개수 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
