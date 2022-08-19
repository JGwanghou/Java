package ch02;
/*
 * 날짜: 2022/08/18
 * 이름: 조광호
 * 내용: 자료형 추론
 */
public class P60 {
	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; string형으로 사용되어서 정수 사용불가
	}

}
