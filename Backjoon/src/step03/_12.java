package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 날짜: 2022/09/02
 * 이름: 조광호
 * 내용: 백준 3단계 12번 문제. EOF 활용한 A+B
 */
public class _12 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		String input;
		
		while( (input = br.readLine() ) != null) {
			
			st = new StringTokenizer(input," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
		
	}

}
