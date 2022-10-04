package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// HashSet 이용
// HashSet은 흔히 아는 lenght 대신 size로 확인 

public class _03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			h.add( Integer.parseInt(br.readLine()) % 42 );
		}
		
		System.out.print(h.size());
	}
}
