package just;

import java.util.Scanner;

public class just07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		
		int n = sc.nextInt();
		int i = 0;
		
		for( i = 2; i <= n; i++) {
			if(n % i == 0) {
				break;
			}
			if(n % i == 1) {
				System.out.println(n + "은(는) 소수입니다.");
			}else {
				System.out.println(n + "소수가 아닙니다");
			}
		}
	}
}
