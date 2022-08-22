package step02;
/*
 * 날짜: 2022/08/20
 * 이름: 조광호
 * 내용: 백준 2단계 6번 문제. 오븐 시계
 */
import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		sc.close();
		
		int min = A * 60 + B;
		min += C;
		
		int hour = (min/60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " "+ minute);
		
		
		
		
		
	}

}
