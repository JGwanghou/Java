package step02;

import java.util.Scanner;

/*
 * 날짜: 2022/08/20
 * 이름: 조광호
 * 내용: 백준 2단계 4번 문제. 사분면 고르기
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println('1');
			}else {
				System.out.println('4');
			}
			
		}else if(y>0) {
				System.out.println('2');
			}else {
				System.out.println('3');
			}
		}
	}

