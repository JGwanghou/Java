package step02;

import java.util.Scanner;

/*
 * 날짜: 2022/08/20
 * 이름: 조광호
 * 내용: 백준 2단계 5번 문제. 알람시계
 */
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		if(M < 45) {
			H--;
			M= 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
