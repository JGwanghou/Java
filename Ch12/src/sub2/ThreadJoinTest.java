package sub2;
/*
 *  날짜 : 2022/09/19
 *  이름 : 조광호
 *  내용 : 스레드 Join 실습
 */
public class ThreadJoinTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		// 스레드실행(비동기 방식으로 실행) ct1실행 , ct2실행, ct3실행 순ㅊ차적
		ct1.start(); // 스레드 파생, 1000번돌리고 메인스레드에 합류 (조인)
		
		ct2.start();
		
		ct3.start();
		
		// 자식스레드의 작업이 완료된 후 다시 메인 스레드로 합류(스레드 대기)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("count 값 : " + count.getNum()); // 자식스레드 진행과정 상관없이 출력을 끝내버려 0이나옴
				
	}
}
