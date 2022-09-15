package just;

import java.util.ArrayList;

public class abc {
	public static void main(String[] args) {
		//ArrayList<Object> list = new ArrayList<Object>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);	//list.add(new Integer(10));
		list.add(20);
		list.add(30);	// String을 추가
		
//		Integer i = (Integer)list.get(2); 
		Integer i = list.get(2);
		
		System.out.println(list);
	}
}
