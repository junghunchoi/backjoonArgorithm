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
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String n = br.readLine();
	int size = n.length();
	
	int n1=Integer.parseInt(n);
	int result=0;
	
	//하나하나씩 계산하는것은 적은 양의 데이터를 처리할때는 상관없지만 최대한 그범위를 줄여야한다.
	for(int i=n1-(9*size);i<n1;i++) {
		int sum=i;
		int k=i;
		while(sum!=0) {
			sum+=k%10;
			k/=10;
		}
		if(i+sum==n1) {
			result=i;
			break;
		}
	}
	System.out.println(result);
	}

}
