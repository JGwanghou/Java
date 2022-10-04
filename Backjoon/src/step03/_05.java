package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜: 2022/08/24
 * 이름: 조광호
 * 내용: 백준 3단계 5번 문제. 빠른A+B
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			//bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}