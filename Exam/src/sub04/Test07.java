package sub04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 *  날짜 : 2022/09/16
 *  이름 : 조광호
 *  내용 : 리스트 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		printList(createList());
	}
	
	public static void printList(??? scoreList) {
		
		int total = 0;
		int size = scoreList.size();
				
		for(int i=0; i<size; i++) {
			int score = scoreList.get(i);
			total += score;
			System.out.println(score);
			
			if(i == size -1) {
				System.out.println(" = ");
			}else {
				System.out.println(" + ");
			}
		}
		System.out.println(total);
	}
	
	public static  createList() {
		
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 1; i <= 10; i++) {
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		
		return scoreList;
	}
}
