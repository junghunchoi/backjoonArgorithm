package argorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2331 {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
/* 코딩에선 현실세계에선 다르게 무식한 방법으로 많은 양의 계산이 가능하기 때문에
 * 현실세계에서의 방법을 적용하기보단 단계단계밟아가는 알고리즘을 통해 문제를
 * 해결해야한다 따라서 계속 문제를 풀어가면서 다양한 메소드,api등을 학습하자 */
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		// 자릿수의 길이를 알기위해 일단 문자열로 입력받는다.
		String str_N = br.readLine();
 
		// 해당 문자열의 길이 변수
		int N_len = str_N.length();
 
		// 문자열을 정수(int)로 변환 
		int N = Integer.parseInt(str_N);
		int result = 0;
 
		
		// i 는 가능한 최솟값인 N - 9 * N의 각 자릿수부터 시작 
		for(int i = (N - (N_len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;	// 각 자릿수 합 변수 
			
			while(number != 0) {
				sum += number % 10;	// 각 자릿수 더하기
				number /= 10;
			}
			
			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우) 
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
	}

}
