package ch02;
/*
 * 날짜: 2022/08/18
 * 이름: 조광호
 * 내용: 명시적 형 변환 (바이트가 큰 크기에서 작은 크기로)
 */
public class P68 {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2);	 // 두 실수의 합이 먼저 계산되고 형 변환
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
