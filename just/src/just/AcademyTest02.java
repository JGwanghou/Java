package just;

import java.util.Scanner;

public class AcademyTest02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i = 0; i<n; i++) {
			for(int j = 1; j < n-i; j++) {
				System.out.printf(" ");
			}
			for(int j = 0; j < i+1; j++) {
				System.out.printf("*");
			}System.out.println();
		}
	}
}
