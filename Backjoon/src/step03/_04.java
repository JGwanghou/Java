package step03;

import java.util.Scanner;

/*
 * 날짜: 2022/08/21
 * 이름: 조광호
 * 내용: 백준 3단계 4번 문제. 영수증
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
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
