package step01;

import java.util.Scanner;

/*
 * 날짜: 2022/08/19
 * 이름: 조광호
 * 내용: 백준 1단계 12번 문제. 곱셈구하기
 */
public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();

		System.out.println(b.charAt(2)*a);
		System.out.println(b.charAt(1)*a);
		System.out.println(b.charAt(0)*a);
		
	}
}
