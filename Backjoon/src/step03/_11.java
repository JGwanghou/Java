package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/27
 * 이름: 조광호
 * 내용: 백준 3단계 11번 문제. A+B -5
 */
public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0) {
				break;
			}
			System.out.println(A+B);
		}
	}
	
}
		
