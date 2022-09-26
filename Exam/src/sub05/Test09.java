package sub05;

public class Test09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0; i < 7; i++) {
			
			if ( i <= 3)
				count++;
			else
				count--;
			
			for(int j = 1; j< 5 - count; j++)
				System.out.printf("☆");
			
			for(int k = 1; k < 2*count; k++)
				System.out.printf("★");
					
			for(int j = 1; j < 5 - count; j++)
				System.out.printf("☆");
			
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
	}
}
