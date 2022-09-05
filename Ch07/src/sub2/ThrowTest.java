package sub2;
/*
 * 날짜: 2022/09/05
 * 이름: 조광호
 * 내용: 예외 던지기 실습하기
 * 
 * 예외 던지기
 *  - 메서드 내부에서 발생하는 예외를 메서드를 호출한 곳으로 던지기(throws)
 *  - 사용자가 생성한 예외를 던지기 위해 throw와 throws를 선언
 */
public class ThrowTest {
	public static void main(String[] args) {
		
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1,2);
		int r2 = cal.minus(1, 2);
		int r3 = 0;
		int r4 = 0;
		
		try {
			r3 = cal.multi(2, 3);
			r4 = cal.div(2, 0);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}
}
