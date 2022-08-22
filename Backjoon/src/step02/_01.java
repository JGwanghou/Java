package step02;

import java.util.Scanner;

/*
 * 날짜: 2022/08/20
 * 이름: 조광호
 * 내용: 백준 2단계 1번 문제. (조건문) 두 수 비교하기
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		if(A > B) {
			System.out.println('>');
		}
		
		if(A < B) {
			System.out.println('<');
		}
		
		if(A == B) {
			System.out.println("==");
		}
	}

}
