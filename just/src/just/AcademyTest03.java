package just;

import java.util.Scanner;
/*
 * 다음과 같이 출력하는 프로그램을 작성하시오.
 * 		☆☆☆☆★
 * 		☆☆☆★★
 * 		☆☆★★★
 * 		☆★★★★
 * 		★★★★★
 * 
 */

public class AcademyTest03 {
	public static void main(String[] args) {
		
		
		for(int i = 0; i<5; i++ ) { // 총 5번 반복 수행
			for(int j = 1; j < 5-i; j++) { // 첫줄에는 5-i 만큼 공백을 출력 해야한다.
				System.out.printf("☆");
			}
			for(int j = 0; j < i+1; j++) { // 다음, 오름차순으로 별을 출력한다
				System.out.printf("★");
			}System.out.println();		// 별을 출력 후, 줄 띄움
		}
	}
	
}
