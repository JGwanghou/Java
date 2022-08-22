package step02;

import java.util.Scanner;

/*
 * 날짜: 2022/08/20
 * 이름: 조광호
 * 내용: 백준 2단계 3번 문제. 윤년
 */
public class _03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		sc.close();
		
		if(A%4==0) {
			if(A%400==0) System.out.println('1');
			else if(A%100==0) System.out.println('0');
			else System.out.println('1');
		}
		else System.out.println('0');
	}
}
