package argorithm;

import java.io.IOException;
import java.util.Scanner;

public class no2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		int val = (in.nextInt() * in.nextInt() * in.nextInt());
		int[] arr = new int[10];
		
		while(val!=0) {
			arr[val%10]++;
			val/=10;
		}
		
		for(int result : arr) {
			System.out.println(result);
		}

	}

}
