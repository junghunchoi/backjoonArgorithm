package argorithm;

import java.util.Scanner;

public class no_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//일단 배열에 하나씩 넣고 
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
	//합친결과값 출력하자
		int result = sum(arr, n, m);
		System.out.println(result);
	}
	public static int sum(int[] arr, int n, int m) {
		int sum=0;
		//전체 카드에서 안겹치고 3개씩 뽑는 방법은 하나뽑으면 다음장을 뽑아야하고 2장뽑을여유를 둬여한다
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					int total = arr[i]+arr[j]+arr[k];
					
					//처음 했는데 총합이 같으면 더 갈필요가 없다
					if(total ==sum )
						return total;//return은 break 기능이 있으므로 여기서 끊는다
					
					//크거나 작을 경우 비슷할 떄까지 갱신한다
					if(sum<total&&total<m)
						sum=total;
				}
			}
		}
		
		return sum;
	}
}
