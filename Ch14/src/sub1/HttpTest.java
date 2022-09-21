package sub1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/*
 *  날짜 : 2022/09/21
 *  이름 : 조광호
 *  내용 : HTTP 통신 실습하기
 *  
 *  웹 프로그래밍 TCP/IP 단방향
 */
public class HttpTest {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://google.com"); //url객체생성
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = null;
			
			while((line = br.readLine()) != null) { // 서버로부터 응답되는 데이터가 없으면 끝난다
				
				System.out.println(line);
			}
			br.close();
			
		}catch (Exception e) {
			e.printStackTrace(); // 브라우저 접속이아닌 프로그램으로 서버요청 시 요청거부
		}
	}
}
