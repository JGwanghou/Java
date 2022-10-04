package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 날짜: 2022/09/02
 * 이름: 조광호
 * 내용: 백준 4단계 1번 문제. 최소 최대
 */
public class _01 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		int[] arr = new int[n];
		
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[n-1]);
	}
}
