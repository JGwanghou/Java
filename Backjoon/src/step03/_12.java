package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/09/02
 * 이름: 조광호
 * 내용: 백준 3단계 12번 문제. EOF 활용한 A+B
 */
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
	}

}
