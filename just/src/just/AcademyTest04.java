package just;

public class AcademyTest04 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 1 ; j < 4-i; j++) {
				System.out.printf("☆");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.printf("★");
			}
			for(int j = 1 ; j < 4-i; j++) {
				System.out.printf("☆");
			}System.out.println();
		}
		
	}
}
