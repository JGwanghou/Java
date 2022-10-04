package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜: 2022/08/27
 * 이름: 조광호
 * 내용: 백준 3단계 10번 문제. X보다 작은 수 출력
 */
public class _10 {
	public static void main(String[] args) throws IOException{
		// 버퍼를 이용하여 읽어들일 것이다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// n 과 x를 나눌 것이다
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		// 정수 N개가 있는 수열 A
		st = new StringTokenizer(br.readLine());
		// 기존 문자열 데이터에 더하기
		StringBuilder sb = new StringBuilder();
		// 수열 A를 이루는 정수n개, a의 수열 값,
		for(int i = 1; i <= n; i++) {
			int a = Integer.parseInt(st.nextToken());
				if(a < x) sb.append(a + " ");
		}
		System.out.println(sb);
		
	}
}