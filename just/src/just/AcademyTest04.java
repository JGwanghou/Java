package just;

/*
 * 다음과 같이 출력하는 프로그램을 작성하시오.
 * 
 * 			☆☆☆★☆☆☆
 * 			☆☆★★★☆☆
 *  		☆★★★★★☆
 *  		★★★★★★★
 * 
 */
public class AcademyTest04 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) { 	// 총 4번 반복 수행
			for(int j = 1 ; j < 4-i; j++) {	// 공백 별 출력 수행
				System.out.printf("☆");
			}
			for(int j = 0; j < 2*i+1; j++) { // 별이 첫줄에서 2개씩 늘어나므로 2*i+1 수행
				System.out.printf("★");
			}
			for(int j = 1 ; j < 4-i; j++) {	// 뒷 공백 추가
				System.out.printf("☆");
			}System.out.println();		// 줄 띄움
		}
		
	}
}

