package just;

import java.util.Random;

public class just08 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10};
		
		int money = new Random().nextInt(500) + 1;
		money *= 10;
		System.out.println("금액: "+ money);
		
		for(int i=0; i<coin.length; i++) {
			
		}
	}
}
