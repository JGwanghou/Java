package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜: 2022/09/02
 * 이름: 조광호
 * 내용: 백준4단계 2번 문제
 */
public class _02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 // 9개 정수배열
		int[] arr = new int[9];
		
		 // 9개 원소 값을 넣어라
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 최대값
		int max = 0;
		 // index
		int index = 0;
		// 숫자
		int count = 0;
		// 새로 들어온 입력 값에 대한 반복문
		for(int value : arr) {
			count++;
			if(max < value) {
				max = value;
				index = count;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}