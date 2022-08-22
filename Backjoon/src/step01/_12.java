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
		
		int a = sc.nextInt(); //A는 int로 받는다
		String b = sc.next(); //B는 String 으로 받는다.
		
		sc.close();

		System.out.println(a * (b.charAt(2) -'0'));
		System.out.println(a * (b.charAt(1) -'0'));
		System.out.println(a * (b.charAt(0) -'0'));
		System.out.println(a * Integer.parseInt(b));
		
	}
}
