package sub5;
/*
 * 날짜: 2022/08/30
 * 이름: 조광호
 * 내용: Java 클래스 상속 실습하기
 */
class parent{
	private int num1;
	private int num2;
	
	public parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends parent {
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2);
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3 - num4;
	}
}

public class InheritTest {
	public static void main(String[] args) {
		
		//상속 객체 생성
		Child c = new Child(1, 2, 3, 4);
		
		int r1 = c.plus();
		int r2 = c.minus();
		
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		
		// Car 상속객체 생성
		sedan sonata = new sedan("소나타","흰색",0,2000);
		Truck bongo = new Truck("봉고","파란색",0,0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.load(100);
		bongo.speedUp(80);
		bongo.show();	
		
	}

}
