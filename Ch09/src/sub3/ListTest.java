package sub3;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2022/09/13
 * 이름 : 조광호
 * 내용 : 자료구조 List 실습하기
 * 
 * List
 *  - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
 *  - List를 구현한 ArrayList를 가장 많이 사용
 */
public class ListTest {
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list = new ArrayList<>();
		// 데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1, 6);
		list.remove(2);
		// 데이터 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list);
		// List 크기
		System.out.println("list 크기 : "+ list.size());
		// List 반복문
		for (int n : list) {
			System.out.println(n + " ");
		}
		System.out.println();
		
		// 문자열 리스트
		List<String> people = new ArrayList<>();
		people.add("김유신");
		people.add("강감찬");
		people.add("장보고");
		
		System.out.println(people);
		System.out.println();
		// 객체 리스트
		List<Apple> apples = new ArrayList<>();
		
		apples.add(new Apple("한국", 3000));
		apples.add(new Apple("미국", 2000));
		apples.add(new Apple("일본", 1000));
		
		// 한국 사과
		Apple apple = apples.get(0);
		apple.show();
		
		// 미국 사과
		apples.get(1).show();
		
		// 일본 사과
		apples.get(2).show();
		
		
		
		
		
		
	}
}
