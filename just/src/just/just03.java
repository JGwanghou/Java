package just;

public class just03 {
	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		int sum = 0;
		
		n1 = 2;
		n2 = 5;
		
		if(n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		
		for(int i = n1; i <= n2; i++) {
			sum += i;
		}
		System.out.println("결과: "+ sum);
		
		
		
		
	}
}
