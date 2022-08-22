package step02;

import java.util.Scanner;

/*
 * 날짜: 2022/08/20
 * 이름: 조광호
 * 내용: 백준 2단계 2번 문제. 시험 점수를 성적으로 바꾸는 문제
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		sc.close();
		
		if(A>=90) {
			System.out.println('A');
		} else if(A>=80) {
			System.out.println('B');
		} else if(A>=70) {
			System.out.println('C');
		} else if(A>=60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
		
	}
}