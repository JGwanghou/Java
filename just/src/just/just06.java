package just;

public class just06 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.printf(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.printf("*");
			}
		System.out.println();
		}
	}
	
}
