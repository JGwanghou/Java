package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/24
 * 이름: 조광호
 * 내용: 백준 3단계 10번 문제. 별 찍기2
 */
public class _10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N-i; j++) {
				System.out.print(" ");
			}
		for(int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.print('\n');
		}
	}
}
