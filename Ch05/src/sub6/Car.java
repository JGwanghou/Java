package sub6;

public class Car {
	//멤버 변수, 멤버 메서드
	// 속성
	protected String name;
	protected String color;
	protected int speed;
	
	// 생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	// 기능 (메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명: "+name);
		System.out.println("차량색: "+color);
		System.out.println("현재속도: "+speed);
		
	}
}
