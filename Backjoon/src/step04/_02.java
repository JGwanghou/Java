package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜: 2022/09/02
 * 이름: 조광호
 * 내용: 백준4단계 2번 문제
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i<9; i++) {
			int input = sc.nextInt();
			num[i] = input;
		}
		
		for(int i=0; i<9; i++) {
			if(num[i]>max) {
				max = num[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		
	}
}
