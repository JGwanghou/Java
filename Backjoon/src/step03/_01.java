package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/21
 * 이름: 조광호
 * 내용: 백준 3단계 1번 문제. (반복문)구구단.
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=9; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
