package just;

import java.util.Scanner;
/*
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램을 작성하시오.
 * 입력조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 * 출력조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 */
public class AcademyTest01 {
	public static void main(String[] args) {
		
		// 키보드로부터 입력 받는다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i = 1; i <= n; i++) {	// 총 n번 반복
			for(int j = 0; j < i; j++) {	// i가 반복되면 j도 반복되서 수행된다
				System.out.printf("*");		// 별 출력
			}System.out.println();		// 마지막 출력 후 줄 띄움(엔터)
		}
		
	}
}
