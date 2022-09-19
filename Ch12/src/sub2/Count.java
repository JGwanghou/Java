package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화블럭 : 스레드 간의 경합을 막고 동기방식으로 실행
	public synchronized void setNum() {
		// 3개가 동시에 실행(경합)
		num++;
		
	// synchronized 하나의 스레드가 진입하고 락건다. 다음 대기하고있던 스레드가 진입.
	}
}
