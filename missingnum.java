package DSA;

import java.util.Arrays;

public class missingnum {
public static void main(String args[]) {
	int[] arr = {1,3,4};
	int sum=0;
	int realsum=0;
	for(int a:arr) {
		sum=sum+a;
	}
	Arrays.sort(arr);
	
//   METHOD 1
	System.out.println("Sorted Array : "+Arrays.toString(arr));
	int miss=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=(i+1)) {
			miss=i+1;
			break;
		}
	}
	
	System.out.println("Missing Element is : "+miss);
	
	
//	METHOD 2
	int n=arr.length;
	int lar=arr[n-1];
	realsum=lar*(lar+1)/2;
	
	System.out.println("Missing Number is : "+(realsum-sum));
	
}
}
