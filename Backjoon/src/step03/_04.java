package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/21
 * 이름: 조광호
 * 내용: 백준 3단계 4번 문제. 영수증
 */

/* 물건: product 가격: price 개수: count  총금액: total */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영수증에 적힌 총 금액 : ");
		int total = sc.nextInt();
		
		System.out.println("구매한 물건의 종류의 수");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			total = total - (price * num);
		}
		
		if(total == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}
