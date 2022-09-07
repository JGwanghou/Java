package just;

import java.util.Scanner;
/*
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램을 작성하시오.
 * 단, 오른쪽 기준으로 정렬
 * 
 * 입력조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 * 출력조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 */
public class AcademyTest02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 키보드로부터 입력받는다
		int n = sc.nextInt();				 // 키보드로부터 입력받는다
		
		
		for(int i = 0; i<n; i++) { // 총 n번 반복한다.
			for(int j = 1; j < n-i; j++) { // 내림차순으로 공백을 출력한다
				System.out.printf(" ");
			}
			for(int j = 0; j < i+1; j++) { // 오름차순 별 출력
				System.out.printf("*");
			}System.out.println(); 		// 줄 띄움
		}
	}
}
