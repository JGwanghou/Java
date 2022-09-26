package sub05;

public class Test08 {
	public static void main(String[] args) {
		
		for(int y=2; y <= 9; y++){
			{
				for (int x = 1; x <= 9; x++)
				{
					System.out.printf("%d x %d = %2d\t", y, x, (y*x));
				}
				System.out.printf("\n");
			}
		}
	}
}
